package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.client.PaymentGatewayClient;
import ahmadirfaanhibatullah.spring.core.data.Foo;
import ahmadirfaanhibatullah.spring.core.data.FooBar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }

    @Test
    void testFactory() {
        PaymentGatewayClient paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient.class);
        assertNotNull(paymentGatewayClient);
        assertSame("https://example.com", paymentGatewayClient.getEndpoint());
        assertSame("privateKey", paymentGatewayClient.getPrivateKey());
        assertSame("publicKey", paymentGatewayClient.getPublicKey());
    }

}