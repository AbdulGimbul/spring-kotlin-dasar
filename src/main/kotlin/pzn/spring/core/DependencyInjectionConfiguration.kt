package pzn.spring.core

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import pzn.spring.core.data.Bar
import pzn.spring.core.data.Foo
import pzn.spring.core.data.FooBar

@Configuration
class DependencyInjectionConfiguration {

    @Primary
    @Bean
    fun fooFirst(): Foo{
        return Foo()
    }

    @Bean
    fun fooSecond(): Foo{
        return Foo()
    }

    @Bean
    fun bar(): Bar {
        return Bar()
    }

    @Bean
    fun fooBar(@Qualifier("fooSecond") foo: Foo, bar: Bar): FooBar{
        return FooBar(foo, bar)
    }
}