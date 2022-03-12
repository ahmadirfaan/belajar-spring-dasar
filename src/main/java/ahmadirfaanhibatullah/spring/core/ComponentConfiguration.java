
package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: ComponentConfiguration.java, v 0.1 2022‐03‐13 04.48 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
@ComponentScan(basePackages = {
        "ahmadirfaanhibatullah.spring.core.service",
        "ahmadirfaanhibatullah.spring.core.repository",
        "ahmadirfaanhibatullah.spring.core.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}