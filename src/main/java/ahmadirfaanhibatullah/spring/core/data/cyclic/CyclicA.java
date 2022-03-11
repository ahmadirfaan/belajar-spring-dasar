package ahmadirfaanhibatullah.spring.core.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: CyclicA.java, v 0.1 2022‐03‐11 14.49 Ahmad Irfaan Hibatullah Exp $$
 */

@Data
@AllArgsConstructor
public class CyclicA {

    private CyclicC cyclicC;
}