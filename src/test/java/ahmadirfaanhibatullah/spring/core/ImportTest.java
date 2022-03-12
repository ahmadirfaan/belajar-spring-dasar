package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Bar;
import ahmadirfaanhibatullah.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ImportTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
    }

    @Test
    void testMainConfiguration() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);

        assertNotNull(foo);
        assertNotNull(bar);
    }
}