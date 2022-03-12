package ahmadirfaanhibatullah.spring.core.configuration;

import ahmadirfaanhibatullah.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: FooConfiguration.java, v 0.1 2022‐03‐13 04.32 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }
}