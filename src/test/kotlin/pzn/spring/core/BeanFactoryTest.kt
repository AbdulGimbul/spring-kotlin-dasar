package pzn.spring.core

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.ObjectProvider
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pzn.spring.core.data.Foo
import java.util.stream.Collectors

class BeanFactoryTest {

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(ScanConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testBeanFactory(){

        val fooObjectProvider: ObjectProvider<Foo> = applicationContext.getBeanProvider(Foo::class.java)
        val fooList: List<Foo> = fooObjectProvider.stream().collect(Collectors.toList())

        println(fooList)

        val beans: Map<String, Foo> = applicationContext.getBeansOfType(Foo::class.java)
        println(beans)

    }

}