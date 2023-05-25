package org.sid.customerservice.mappers;

import org.modelmapper.ModelMapper;
import org.sid.customerservice.dto.CustomerRequest;
import org.sid.customerservice.entities.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper
{
    private ModelMapper modelMapper = new ModelMapper();
    public Customer from(CustomerRequest customerRequest)
    {
        return modelMapper.map(customerRequest,Customer.class);
    }
}

