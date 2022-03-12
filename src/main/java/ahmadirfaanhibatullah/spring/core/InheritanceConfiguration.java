
package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.service.impl.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: InheritanceConfiguration.java, v 0.1 2022‐03‐13 05.43 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
}