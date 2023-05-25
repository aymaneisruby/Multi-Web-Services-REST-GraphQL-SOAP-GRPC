package org.sid.customerservice.web.rest;
import lombok.AllArgsConstructor;
import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerRestController
{
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> customerList()
    {
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer customerById(@PathVariable Long id)
    {
        return customerRepository.findById(id).orElse(null);
    }

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        customerRepository.save(customer);
        return customer;
    }

}
