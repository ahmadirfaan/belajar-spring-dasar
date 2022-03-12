
package ahmadirfaanhibatullah.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: ScanConfiguration.java, v 0.1 2022‐03‐13 04.40 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
@ComponentScan(basePackages = {
        "ahmadirfaanhibatullah.spring.core.configuration"
})
public class ScanConfiguration {
}