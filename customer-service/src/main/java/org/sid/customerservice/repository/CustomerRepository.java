package org.sid.customerservice.repository;
import org.sid.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long>
{
    @RestResource(path = "/byId")
    List<Customer> findById(@Param("i")int id);
}
