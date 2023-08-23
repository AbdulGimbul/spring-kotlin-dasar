package pzn.spring.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pzn.spring.core.data.Bar
import pzn.spring.core.data.Foo
import pzn.spring.core.data.FooBar

class DependencyInjectionTest {
    private lateinit var applicationContext: ApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(DependencyInjectionConfiguration::class.java)
    }

    @Test
    fun testDI(){

        val foo = applicationContext.getBean("fooSecond", Foo::class.java)
        val bar = applicationContext.getBean(Bar::class.java)
        val fooBar = applicationContext.getBean(FooBar::class.java)

        Assertions.assertSame(foo, fooBar.foo)
        Assertions.assertSame(bar, fooBar.bar)
    }

    @Test
    fun testNoDI(){

        var foo = Foo()
        var bar = Bar()

        var fooBar = FooBar(foo, bar)

        Assertions.assertSame(foo, fooBar.foo)
        Assertions.assertSame(bar, fooBar.bar)
    }
}