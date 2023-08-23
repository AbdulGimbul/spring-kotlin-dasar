package pzn.spring.core

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import pzn.spring.core.data.Bar
import pzn.spring.core.data.Foo
import pzn.spring.core.data.FooBar
import java.util.Optional

@Configuration
class OptionalConfiguration {

    @Bean
    fun foo(): Foo {
        return Foo()
    }

    @Bean
    fun fooBar(foo: Optional<Foo>, bar: Optional<Bar>): FooBar{
        return FooBar(foo.orElse(null), bar.orElse(null))
    }
}