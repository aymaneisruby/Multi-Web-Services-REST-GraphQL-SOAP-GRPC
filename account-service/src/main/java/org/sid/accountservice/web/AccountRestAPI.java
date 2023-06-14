package org.sid.accountservice.web;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.sid.accountservice.feign.CustomerRestClient;
import org.sid.accountservice.mappers.CustomerMapper;
import org.sid.accountservice.model.Customer;
import org.sid.customerservice.stubs.CustomerGrpcServiceGrpc;
import org.sid.customerservice.stubs.CustomerService;
import org.sid.customerservice.web.soap.CustomerSoapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AccountRestAPI
{
        @Autowired
        private CustomerSoapService customerSoapService;
        @Autowired
        private CustomerMapper customerMapper;
        @Autowired
        private CustomerRestClient customerRestClient;
        @GetMapping("/customersSoap")
        public List<Customer> customerList(){
            List<org.sid.customerservice.web.soap.Customer> customerList = customerSoapService.allCustomers();
            List<Customer> customers = customerList.stream().map(customerMapper::fromSoapCustomerToCustomer)
                    .collect(Collectors.toList());
            return customers;
        }
        @GrpcClient("customerService")
        private CustomerGrpcServiceGrpc.CustomerGrpcServiceBlockingStub customerGrpcServiceBlockingStub;

        @GetMapping("/customersGrpc")
        public List<Customer> customerListGrpc(){
            CustomerService.GetAllCustomersResponse response = customerGrpcServiceBlockingStub
                    .getListCustomers(CustomerService.GetAllCustomersRequest.newBuilder().getDefaultInstanceForType());
            return response.getCustomersList()
                    .stream()
                    .map(customerMapper::fromGrpcCustomerToCustomer)
                    .collect(Collectors.toList());
        }

        @GetMapping("/customersGql")
        public Mono<List<Customer>> getAllCustomersGql(){
            HttpGraphQlClient graphQlClient=HttpGraphQlClient.builder()
                    .url("http://localhost:8082/graphql")
                    .build();
            var httpRequestDocument= """
                 query{
                    allCustomers{
                      id, name, email
                    }
                  }
                """;
            Mono<List<Customer>> customers = graphQlClient.document(httpRequestDocument).retrieve("allCustomers").toEntityList(Customer.class);
            return customers;
        }
    @GetMapping("/customersGraphql")
    public Mono<List<Customer>> getAllCustomersGqlWithoutId(){
        HttpGraphQlClient graphQlClient=HttpGraphQlClient.builder()
                .url("http://localhost:8082/graphql")
                .build();
        var httpRequestDocument= """
                 query{
                    allCustomers{
                      name, email
                    }
                  }
                """;
        Mono<List<Customer>> customers = graphQlClient.document(httpRequestDocument).retrieve("allCustomers").toEntityList(Customer.class);
        return customers;
    }
        @GetMapping("/customerByIdGql/{id}")
        public Mono<Customer> findCustomerById(@PathVariable Long id){
            HttpGraphQlClient graphQlClient=HttpGraphQlClient.builder()
                    .url("http://localhost:8082/graphql")
                    .build();
            var httpRequestDocument= """
                 query($id:Int){
                  customerById(id:$id){
                    id, name, email
                  }
                 }
                """;
            Mono<Customer> customerById = graphQlClient.document(httpRequestDocument).variable("id",id).retrieve("customerById").toEntity(Customer.class);
            return customerById;
        }
        @GetMapping("/customersRestTemplate")
        public List<Customer> allRestTemplateCustomers(){
            RestTemplate restTemplate=new RestTemplate();
            Customer[] customers = restTemplate.getForObject("http://localhost:8082/customers", Customer[].class);
            return List.of(customers);
        }
        @GetMapping("/customersWebClient")
        public Flux<Customer> allCustomersWebClient(){
            WebClient webClient= WebClient.builder()
                    .baseUrl("http://localhost:8082/")
                    .build();
            Flux<Customer> customerFlux = webClient.get().uri("/customers").retrieve().bodyToFlux(Customer.class);
            return customerFlux;
        }
        @GetMapping("/customersWebClient/{id}")
        public Mono<Customer> customerByIdWebClient(@PathVariable Long id){
            WebClient webClient= WebClient.builder()
                    .baseUrl("http://localhost:8082/")
                    .build();
            Mono<Customer> customerMono = webClient.get().uri("/customers/{id}", id).retrieve().bodyToMono(Customer.class);
            return customerMono;
        }
        @GetMapping("/customersRestFeign")
        public List<Customer> allRestFeignCustomers()
        {
            return customerRestClient.findCustomers();
        }
        @GetMapping("/customerByIdRestFeign/{id}")
        public Customer customerByIdRestFeign(@PathVariable Long id)
        {
            return customerRestClient.findCustomerById(id);
        }
    }
