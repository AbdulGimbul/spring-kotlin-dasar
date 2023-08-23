package pzn.spring.core

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import pzn.spring.core.data.Foo
import kotlin.math.log

@Slf4j
@Configuration
class BeanConfiguration {
    private val logger = LoggerFactory.getLogger(BeanConfiguration::class.java);

    @Bean
    fun foo(): Foo {
        val foo = Foo();
        logger.info("Create new foo");
        return foo;
    }
}