package org.sid.customerservice.web.rest;
import lombok.AllArgsConstructor;
import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        return customerRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Customer % not Found",id)));
    }

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        customerRepository.save(customer);
        return customer;
    }

    @DeleteMapping("/customers/{Id}")
    public ResponseEntity<String> delete(@PathVariable Long Id) {
        try {
            customerRepository.deleteById(Id);
            return ResponseEntity.ok("Customer deleted successfully.");
        } catch (EmptyResultDataAccessException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer not found.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete customer.");
        }
    }

}
