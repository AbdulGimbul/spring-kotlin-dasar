package pzn.spring.core.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import pzn.spring.core.data.Foo

@Configuration
class FooConfiguration {

    @Primary
    @Bean
    fun foo(): Foo {
        return Foo()
    }

    @Bean
    fun foo2(): Foo {
        return Foo()
    }

    @Bean
    fun foo3(): Foo {
        return Foo()
    }
}