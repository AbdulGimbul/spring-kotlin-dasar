package pzn.spring.core

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import pzn.spring.core.configuration.BarConfiguration
import pzn.spring.core.configuration.FooConfiguration

@Configuration
@Import(FooConfiguration::class, BarConfiguration::class)
class MainConfiguration {
}