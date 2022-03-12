
package ahmadirfaanhibatullah.spring.core.data;

import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: MultiFoo.java, v 0.1 2022‐03‐13 05.27 Ahmad Irfaan Hibatullah Exp $$
 */

@Component
public class MultiFoo {

    @Getter

    private List<Foo> foos;

    public MultiFoo(ObjectProvider<Foo> objectProvider) {
        foos = objectProvider.stream().collect(Collectors.toList());
    }
}