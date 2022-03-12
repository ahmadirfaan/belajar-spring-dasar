package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Bar;
import ahmadirfaanhibatullah.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ScopeConfigurationTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void scopeTest() {
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);
        Foo foo3 = applicationContext.getBean(Foo.class);

        assertNotSame(foo1, foo2);
        assertNotSame(foo1, foo3);
        assertNotSame(foo2, foo3);

    }

    @Test
    void doubletonTest() {
        Bar bar1 = applicationContext.getBean(Bar.class);
        Bar bar2 = applicationContext.getBean(Bar.class);
        Bar bar3 = applicationContext.getBean(Bar.class);
        Bar bar4 = applicationContext.getBean(Bar.class);

        assertSame(bar1, bar3);
        assertSame(bar2, bar4);
        assertNotSame(bar1, bar2);
        assertNotSame(bar3, bar4);
    }
}