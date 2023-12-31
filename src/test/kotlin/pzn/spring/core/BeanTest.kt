package pzn.spring.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pzn.spring.core.data.Foo

class BeanTest {

    @Test
    fun testCreateBean(){
        val context = AnnotationConfigApplicationContext(BeanConfiguration::class.java);

        Assertions.assertNotNull(context);
    }

    @Test
    fun testGetBean(){
        val context = AnnotationConfigApplicationContext(BeanConfiguration::class.java);

        val foo1 = context.getBean(Foo::class.java);
        val foo2 = context.getBean(Foo::class.java);

        Assertions.assertSame(foo1, foo2);
    }
}