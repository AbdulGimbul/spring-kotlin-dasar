package pzn.spring.core

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pzn.spring.core.data.Connection
import pzn.spring.core.data.Server

class LifeCycleTest {

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(LifeCycleConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @AfterEach
    fun tearDown(){
//        applicationContext.close()
    }

    @Test
    fun testConnection(){

        val connection = applicationContext.getBean(Connection::class.java)
    }

    @Test
    fun testServer(){
        val server = applicationContext.getBean(Server::class.java)
    }
}