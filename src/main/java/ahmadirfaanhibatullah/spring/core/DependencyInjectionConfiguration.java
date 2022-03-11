package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Bar;
import ahmadirfaanhibatullah.spring.core.data.Foo;
import ahmadirfaanhibatullah.spring.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: BeanNameConfiguration.java, v 0.1 2022‐03‐11 10.18 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
public class DependencyInjectionConfiguration {

    @Bean()
    @Primary
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean()
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}