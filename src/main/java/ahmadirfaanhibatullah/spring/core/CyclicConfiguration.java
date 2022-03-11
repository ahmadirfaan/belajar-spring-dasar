
package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.cyclic.CyclicA;
import ahmadirfaanhibatullah.spring.core.data.cyclic.CyclicB;
import ahmadirfaanhibatullah.spring.core.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: CyclicConfiguration.java, v 0.1 2022‐03‐11 14.51 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicC cyclicC) {
        return new CyclicA(cyclicC);
    }

    @Bean
    public CyclicB cyclicA(CyclicA cyclicA) {
        return new CyclicB(cyclicA);
    }

    @Bean
    public CyclicC cyclicC(CyclicB cyclicB) {
        return new CyclicC(cyclicB);
    }
}