
package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Connection;
import ahmadirfaanhibatullah.spring.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: LifecycleConfiguration.java, v 0.1 2022‐03‐13 04.15 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
public class LifecycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

//    @Bean(
//            initMethod = "start",
//            destroyMethod = "stop" //dapat menggunakan anotasi PostConstruct dan PreDestroy di class tersebut
    // jika memakai library bawaan bisa memakai init method ataupun destroy method
//    )
    @Bean
    public Server server() {
        return new Server();
    }
}