package pzn.spring.core.factory

import org.springframework.beans.factory.FactoryBean
import org.springframework.stereotype.Component
import pzn.spring.core.client.PaymentGatewayClient

@Component("paymentGatewayClient")
class PaymentGatewatyClientFactoryBean : FactoryBean<PaymentGatewayClient> {

    override fun getObject(): PaymentGatewayClient? {
        val client = PaymentGatewayClient(
            endpoint = "https://example.com",
            privateKey = "private",
            publicKey = "public"
        );
        return client
    }

    override fun getObjectType(): Class<*>? {
        return PaymentGatewayClient::class.java
    }
}