package pzn.spring.core

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import org.springframework.context.annotation.Lazy
import pzn.spring.core.data.Bar
import pzn.spring.core.data.Foo

@Slf4j
@Configuration
class DependsOnConfiguration {
    private val logger = LoggerFactory.getLogger(BeanConfiguration::class.java);

    @Lazy
    @Bean
    @DependsOn("bar")
    fun foo(): Foo {
        logger.info("Create new foo")
        return Foo()
    }

    @Bean
    fun bar(): Bar {
        logger.info("Create new bar")
        return Bar()
    }
}