package ahmadirfaanhibatullah.spring.core.application;

import ahmadirfaanhibatullah.spring.core.data.Bar;
import ahmadirfaanhibatullah.spring.core.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: FooApplication.java, v 0.1 2022‐03‐13 18.00 Ahmad Irfaan Hibatullah Exp $$
 */

@SpringBootApplication
public class FooApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FooApplication.class, args);

        Foo foo = context.getBean(Foo.class);
        System.out.println(foo);
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }
}