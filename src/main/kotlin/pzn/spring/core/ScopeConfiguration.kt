package pzn.spring.core

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.config.CustomScopeConfigurer
import org.springframework.context.annotation.*
import pzn.spring.core.data.Bar
import pzn.spring.core.data.Foo
import pzn.spring.core.scope.DoubletonScope

@Configuration
class ScopeConfiguration {
    private val logger = LoggerFactory.getLogger(BeanConfiguration::class.java);

    @Bean
    @Scope("prototype")
    fun foo(): Foo {
        logger.info("Create new foo")
        return Foo()
    }

    @Bean
    fun customScopeConfigurer(): CustomScopeConfigurer {
        val configurer = CustomScopeConfigurer()
        configurer.addScope("doubleton", DoubletonScope())
        return configurer
    }

    @Bean
    @Scope("doubleton")
    fun bar(): Bar {
        logger.info("Create new bar")
        return Bar()
    }
}