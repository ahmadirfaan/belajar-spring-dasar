package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: PrimaryBeanConfiguration.java, v 0.1 2022‐03‐11 10.18 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
@Configuration
public class PrimaryBeanConfiguration {

    @Primary
    @Bean
    public Foo foo1() {
        Foo foo = new Foo();
        log.info("Create new Bean Foo 1");
        return foo;
    }

    @Bean
    public Foo foo2() {
        Foo foo = new Foo();
        log.info("Create new Bean Foo 2");
        return foo;
    }
}