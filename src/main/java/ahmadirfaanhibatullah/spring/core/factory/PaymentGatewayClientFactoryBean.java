package ahmadirfaanhibatullah.spring.core.factory;

import ahmadirfaanhibatullah.spring.core.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: PaymentGatewayClientFactoryBean.java, v 0.1 2022‐03‐13 05.34 Ahmad Irfaan Hibatullah Exp $$
 */

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {


    @Override
    public PaymentGatewayClient getObject() {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndpoint("https://example.com");
        client.setPrivateKey("privateKey");
        client.setPublicKey("publicKey");
        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}