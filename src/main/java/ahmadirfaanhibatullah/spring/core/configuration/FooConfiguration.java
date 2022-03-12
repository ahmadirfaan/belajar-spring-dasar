package ahmadirfaanhibatullah.spring.core.configuration;

import ahmadirfaanhibatullah.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: FooConfiguration.java, v 0.1 2022‐03‐13 04.32 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
public class FooConfiguration {

    @Bean
    @Primary
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }

    @Bean
    public Foo fo3() {
        return new Foo();
    }
}