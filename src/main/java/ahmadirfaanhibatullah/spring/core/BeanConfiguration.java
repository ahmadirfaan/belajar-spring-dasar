package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: BeanConfiguration.java, v 0.1 2022‐03‐11 10.03 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Create new Bean Foo");
        return foo;
    }
}