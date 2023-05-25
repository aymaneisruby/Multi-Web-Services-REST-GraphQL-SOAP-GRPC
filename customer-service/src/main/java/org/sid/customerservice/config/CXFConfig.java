package org.sid.customerservice.config;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.sid.customerservice.web.soap.CustomerSoapService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CXFConfig
{
    private Bus bus;
    private CustomerSoapService customerSoapService;

    @Bean
    public EndpointImpl endpoint()
    {
        EndpointImpl endpoint = new EndpointImpl(bus,customerSoapService);
        endpoint.publish("/CustomerService");
        return endpoint;
    }
}
