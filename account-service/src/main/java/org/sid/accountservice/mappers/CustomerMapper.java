package org.sid.accountservice.mappers;
import org.modelmapper.ModelMapper;
import org.sid.accountservice.model.Customer;
import org.sid.customerservice.stubs.CustomerService;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public Customer fromGrpcCustomerToCustomer(CustomerService.Customer source){
        return modelMapper.map(source,Customer.class);
    }
    public CustomerService.Customer fromCustomerToGrpcCustomer(Customer customer){
        return modelMapper.map(customer,CustomerService.Customer.Builder.class).build();
    }
    public Customer fromSoapCustomerToCustomer(org.sid.customerservice.web.soap.Customer customer){
        return modelMapper.map(customer, Customer.class);
    }
    public org.sid.customerservice.web.soap.Customer fromCustomerToSoapCustomer(Customer customer){
        return modelMapper.map(customer, org.sid.customerservice.web.soap.Customer.class);
    }
}