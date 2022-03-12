package ahmadirfaanhibatullah.spring.core.data;

import ahmadirfaanhibatullah.spring.core.aware.IdAware;
import lombok.Getter;
import org.springframework.stereotype.Component;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: Car.java, v 0.1 2022‐03‐13 06.00 Ahmad Irfaan Hibatullah Exp $$
 */

@Component
public class Car implements IdAware {

    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
}