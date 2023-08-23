package pzn.spring.core

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import pzn.spring.core.listener.LoginAgainSuccessListener
import pzn.spring.core.listener.LoginSuccessListener
import pzn.spring.core.listener.UserListener
import pzn.spring.core.service.UserService

class EventListenerTest {

    @Configuration
    @Import(UserService::class, LoginSuccessListener::class, LoginAgainSuccessListener::class, UserListener::class)
    class TestConfiguration{}

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(TestConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testEvent(){

        val userService = applicationContext.getBean(UserService::class.java)
        userService.login("abdl", "abdl")
        userService.login("abdl", "rahasia")
        userService.login("abdl", "salah")
    }
}