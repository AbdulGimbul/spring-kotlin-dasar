package pzn.spring.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pzn.spring.core.data.Foo

class BeanNameTest {

    private lateinit var applicationContext: ApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(BeanNameConfiguration::class.java);
    }

    @Test
    fun testBeanName(){

        val foo = applicationContext.getBean(Foo::class.java)
        val fooFirst = applicationContext.getBean("fooFirst", Foo::class.java)
        val fooSecond = applicationContext.getBean("fooSecond", Foo::class.java)

        Assertions.assertSame(foo, fooFirst)
        Assertions.assertNotSame(foo, fooSecond)
        Assertions.assertNotSame(fooFirst, fooSecond)

    }
}