
package ahmadirfaanhibatullah.spring.core.configuration;

import ahmadirfaanhibatullah.spring.core.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: CustomerConfiguration.java, v 0.1 2022‐03‐13 05.15 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
public class CustomerConfiguration {

    @Primary
    @Bean
    public CustomerRepository normalCustomerRepository() {
        return  new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository() {
        return  new CustomerRepository();
    }
}