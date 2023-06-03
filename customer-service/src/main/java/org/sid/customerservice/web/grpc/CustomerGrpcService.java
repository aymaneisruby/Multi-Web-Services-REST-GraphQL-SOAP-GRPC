package org.sid.customerservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.mappers.CustomerMapper;
import org.sid.customerservice.repository.CustomerRepository;
import org.sid.customerservice.stubs.CustomerGrpcServiceGrpc;
import org.sid.customerservice.stubs.CustomerOuterClass;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@AllArgsConstructor
public class CustomerGrpcService extends CustomerGrpcServiceGrpc.CustomerGrpcServiceImplBase {
    private CustomerRepository customerRepository;

    private CustomerMapper customerMapper;
    @Override
    public void getCustomer(CustomerOuterClass.GetCustomerRequest request,
                            StreamObserver<CustomerOuterClass.GetCustomerResponse> responseObserver) {
        Customer customer = customerRepository.findById(request.getId()).get();
        CustomerOuterClass.Customer grpcCustomer = customerMapper.fromCustomer(customer);
        CustomerOuterClass.GetCustomerResponse customerResponse=CustomerOuterClass.GetCustomerResponse.newBuilder()
                .setCustomer(grpcCustomer)
                .build();
        responseObserver.onNext(customerResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getListCustomers(CustomerOuterClass.GetAllCustomersRequest request,
                                 StreamObserver<CustomerOuterClass.GetAllCustomersResponse> responseObserver) {
        List<Customer> customerList = customerRepository.findAll();
        CustomerOuterClass.GetAllCustomersResponse.Builder customersBuilder = CustomerOuterClass.GetAllCustomersResponse.newBuilder();
        List<CustomerOuterClass.Customer> customers = customerList.stream().map(customerMapper::fromCustomer).collect(Collectors.toList());
        customersBuilder.addAllCustomers(customers);
        responseObserver.onNext(customersBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void saveCustomer(CustomerOuterClass.SaveCustomerRequest request,
                             StreamObserver<CustomerOuterClass.SaveCustomerResponse> responseObserver) {
        Customer customer=new Customer();
        customer.setName(request.getName());
        customer.setEmail(request.getEmail());
        Customer savedCustomer = customerRepository.save(customer);
        CustomerOuterClass.Customer grpcCustomer = customerMapper.fromCustomer(savedCustomer);
        CustomerOuterClass.SaveCustomerResponse response = CustomerOuterClass.SaveCustomerResponse.newBuilder()
                .setCustomer(grpcCustomer)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}