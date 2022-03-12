package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Car;
import ahmadirfaanhibatullah.spring.core.data.Foo;
import ahmadirfaanhibatullah.spring.core.processor.FooBeanFactoryPostProcessor;
import ahmadirfaanhibatullah.spring.core.processor.IdGeneratorBeanPostProcessor;
import ahmadirfaanhibatullah.spring.core.processor.PrefixIdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: BeanFactoryPostProcessorTest.java, v 0.1 2022‐03‐13 06.12 Ahmad Irfaan Hibatullah Exp $$
 */
public class BeanFactoryPostProcessorTest {

    @Configuration
    @Import({
            FooBeanFactoryPostProcessor.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }

    @Test
    void testBeanFactoryPostProcessor() {
        Foo foo = applicationContext.getBean(Foo.class);

        Assertions.assertNotNull(foo);
    }
}
