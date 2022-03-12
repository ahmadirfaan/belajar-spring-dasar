package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Connection;
import ahmadirfaanhibatullah.spring.core.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class LifecycleConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
//        applicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }

    @Test
    void testConnection() {
        Connection connection = applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer() {
        Server server = applicationContext.getBean(Server.class);
    }
}