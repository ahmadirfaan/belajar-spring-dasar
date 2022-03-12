package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Bar;
import ahmadirfaanhibatullah.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: DependsOnConfiguration.java, v 0.1 2022‐03‐13 03.41 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    @Lazy
    @DependsOn({
            "bar"
    })
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}