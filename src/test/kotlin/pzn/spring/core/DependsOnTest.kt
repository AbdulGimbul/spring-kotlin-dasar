package pzn.spring.core

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pzn.spring.core.data.Foo

class DependsOnTest {

    private lateinit var applicationContext: ApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(DependsOnConfiguration::class.java)
    }

    @Test
    fun testDependsOn(){
        val foo = applicationContext.getBean(Foo::class.java)
    }
}