package pzn.spring.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import pzn.spring.core.service.AuthService

class AwareTest {

    @Configuration
    @Import(AuthService::class)
    class TestConfiguration{
    }

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(TestConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testAware(){
        val authService = applicationContext.getBean(AuthService::class.java)

        Assertions.assertEquals("pzn.spring.core.service.AuthService", authService.beanName)
        Assertions.assertNotNull(authService.applicationContext)
        Assertions.assertSame(applicationContext, authService.applicationContext)
    }
}