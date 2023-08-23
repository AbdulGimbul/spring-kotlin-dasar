package pzn.spring.core

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Primary
import pzn.spring.core.data.Foo

class PrimaryConfiguration {

    @Primary
    @Bean
    fun foo1(): Foo {
        return Foo();
    }

    @Bean
    fun foo2(): Foo
    {
        return Foo();
    }
}