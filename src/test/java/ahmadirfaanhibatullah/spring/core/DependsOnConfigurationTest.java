package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DependsOnConfigurationTest {


    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void test() {
        Foo foo = applicationContext.getBean(Foo.class);
    }
}