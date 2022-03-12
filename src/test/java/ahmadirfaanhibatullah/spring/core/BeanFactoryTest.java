
package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Foo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: BeanFactoryTest.java, v 0.1 2022‐03‐13 05.49 Ahmad Irfaan Hibatullah Exp $$
 */
public class BeanFactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }

    @Test
    void testBeanFactory() {

        ObjectProvider<Foo> fooObjectProvider = applicationContext.getBeanProvider(Foo.class);
        List<Foo> foolist = fooObjectProvider.stream().collect(Collectors.toList());

        System.out.println(foolist);

        Map<String, Foo> beans = applicationContext.getBeansOfType(Foo.class);
        System.out.println(beans);
    }
}