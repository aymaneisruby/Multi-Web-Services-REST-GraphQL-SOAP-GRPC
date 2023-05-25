package org.sid.customerservice.web.soap;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.sid.customerservice.dto.CustomerRequest;
import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.mappers.CustomerMapper;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@AllArgsConstructor
@WebService(serviceName = "CustomerWS")
public class CustomerSoapService
{
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @WebMethod(operationName = "AllCustomers")
    public List<Customer> customerList()
    {
        return customerRepository.findAll();
    }

    @WebMethod(operationName = "SearchCustomer")
    public Customer customerById( @WebParam(name = "id") Long id)
    {
        return customerRepository.findById(id).get();
    }

    @WebMethod(operationName = "AddCustomer")
    public Customer saveCustomer(@WebParam(name="customer") CustomerRequest customerRequest)
    {
        Customer customer =  customerMapper.from(customerRequest);
        return customerRepository.save(customer);
    }
}
