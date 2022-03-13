
package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.listener.LoginAgainSuccessListener;
import ahmadirfaanhibatullah.spring.core.listener.LoginSuccessListener;
import ahmadirfaanhibatullah.spring.core.listener.UserListener;
import ahmadirfaanhibatullah.spring.core.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: EventListenerTest.java, v 0.1 2022‐03‐13 17.45 Ahmad Irfaan Hibatullah Exp $$
 */
public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class,
            UserListener.class
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
    void testPublishEvent() {

        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("eko", "eko");
        userService.login("ahmadirfaan", "ahmadirfaan");
        userService.login("salah", "salah");

    }
}