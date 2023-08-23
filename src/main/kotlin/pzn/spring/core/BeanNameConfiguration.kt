package pzn.spring.core

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Primary
import pzn.spring.core.data.Foo

class BeanNameConfiguration {

    @Primary
    @Bean(value = ["fooFirst"])
    fun foo1(): Foo {
        return Foo();
    }

    @Bean(value = ["fooSecond"])
    fun foo2(): Foo
    {
        return Foo();
    }
}