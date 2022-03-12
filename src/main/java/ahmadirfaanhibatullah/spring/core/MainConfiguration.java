package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.configuration.BarConfiguration;
import ahmadirfaanhibatullah.spring.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: MainConfiguration.java, v 0.1 2022‐03‐13 04.33 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
@Import(value = {
        FooConfiguration.class, BarConfiguration.class
})
public class MainConfiguration {
}