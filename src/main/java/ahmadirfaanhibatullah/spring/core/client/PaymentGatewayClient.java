package ahmadirfaanhibatullah.spring.core.client;

import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: PaymentGatewayClient.java, v 0.1 2022‐03‐13 05.33 Ahmad Irfaan Hibatullah Exp $$
 */

@Data
public class PaymentGatewayClient {

    private String endpoint;

    private String publicKey;

    private String privateKey;
}