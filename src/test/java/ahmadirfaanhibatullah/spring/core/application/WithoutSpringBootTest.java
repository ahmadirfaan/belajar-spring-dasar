
package ahmadirfaanhibatullah.spring.core.application;

import ahmadirfaanhibatullah.spring.core.data.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: WithoutSpringBootTest.java, v 0.1 2022‐03‐13 18.10 Ahmad Irfaan Hibatullah Exp $$
 */
public class WithoutSpringBootTest {

    private ConfigurableApplicationContext applicationContext;

    @Test
    void testFooEmpty() {
        assertThrows(UnsatisfiedDependencyException.class, () -> {
            applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
            Foo foo = applicationContext.getBean(Foo.class);
        });
    }
}