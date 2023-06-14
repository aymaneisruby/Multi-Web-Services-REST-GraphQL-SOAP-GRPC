package org.sid.accountservice.test;

import org.sid.customerservice.web.soap.Customer;
import org.sid.customerservice.web.soap.CustomerSoapService;
import org.sid.customerservice.web.soap.CustomerWS;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        CustomerSoapService customerSoapService=new CustomerWS().getCustomerSoapServicePort();
        List<Customer> customers = customerSoapService.allCustomers();
        customers.forEach(c->{
            System.out.println(c.getName());
            System.out.println(c.getEmail());
            System.out.println("-----------");
        });
    }
}
