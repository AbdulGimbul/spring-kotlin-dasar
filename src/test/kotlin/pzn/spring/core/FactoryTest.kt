package pzn.spring.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pzn.spring.core.client.PaymentGatewayClient

class FactoryTest {

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(FactoryConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testFactory(){
        val paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient::class.java)

        Assertions.assertNotNull(paymentGatewayClient)
        Assertions.assertEquals("https://example.com", paymentGatewayClient.endpoint)
        Assertions.assertEquals("private", paymentGatewayClient.privateKey)
        Assertions.assertEquals("public", paymentGatewayClient.publicKey)
    }
}