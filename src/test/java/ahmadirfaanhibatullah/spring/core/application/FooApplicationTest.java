package ahmadirfaanhibatullah.spring.core.application;

import ahmadirfaanhibatullah.spring.core.data.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FooApplication.class)
class FooApplicationTest {

    @Autowired
    Foo foo;

    @Test
    void testFoo() {
         
        assertNotNull(foo);
    }
}