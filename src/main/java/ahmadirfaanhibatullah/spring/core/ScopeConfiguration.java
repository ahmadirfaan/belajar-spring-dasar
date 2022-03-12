package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Bar;
import ahmadirfaanhibatullah.spring.core.data.Foo;
import ahmadirfaanhibatullah.spring.core.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: ScopeConfiguration.java, v 0.1 2022‐03‐13 03.53 Ahmad Irfaan Hibatullah Exp $$
 */
@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope(value = "prototype")
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}