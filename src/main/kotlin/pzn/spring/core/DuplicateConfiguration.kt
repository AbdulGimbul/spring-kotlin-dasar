package pzn.spring.core

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import pzn.spring.core.data.Foo

@Configuration
class DuplicateConfiguration {

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