package ahmadirfaanhibatullah.spring.core.configuration;

import ahmadirfaanhibatullah.spring.core.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: BarConfiguration.java, v 0.1 2022‐03‐13 04.33 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar() {
        return new Bar();
    }
}