package pzn.spring.core

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pzn.spring.core.data.Bar
import pzn.spring.core.data.Foo

class ImportTest {

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(MainConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testImport(){
        val foo = applicationContext.getBean(Foo::class.java)
        val bar = applicationContext.getBean(Bar::class.java)
    }
}