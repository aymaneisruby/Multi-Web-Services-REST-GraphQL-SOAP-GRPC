package org.sid.customerservice.mappers;

import org.modelmapper.ModelMapper;
import org.sid.customerservice.dto.CustomerRequest;
import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.stubs.CustomerOuterClass;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper
{
    private ModelMapper modelMapper = new ModelMapper();
    public Customer from(CustomerRequest customerRequest)
    {
        return modelMapper.map(customerRequest,Customer.class);
    }
    public Customer fromGrpcCustomer(CustomerOuterClass.Customer source){
        return modelMapper.map(source,Customer.class);
    }
    public CustomerOuterClass.Customer fromCustomer(Customer customer){
        return modelMapper.map(customer,CustomerOuterClass.Customer.Builder.class).build();
    }
}

