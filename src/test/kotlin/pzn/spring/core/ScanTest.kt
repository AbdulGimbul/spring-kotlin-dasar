package pzn.spring.core

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pzn.spring.core.data.Bar
import pzn.spring.core.data.Foo

class ScanTest {

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(ScanConfiguration::class.java)
    }

    @Test
    fun testScan(){
        val foo = applicationContext.getBean(Foo::class.java)
        val bar = applicationContext.getBean(Bar::class.java)


    }
}