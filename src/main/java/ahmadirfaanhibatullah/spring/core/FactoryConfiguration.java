
package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: FactoryConfiguration.java, v 0.1 2022‐03‐13 05.37 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}