package pzn.spring.core

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import pzn.spring.core.data.MultiFoo

@Configuration
@ComponentScan(
    basePackages = [
        "pzn.spring.core.service",
        "pzn.spring.core.repository",
        "pzn.spring.core.configuration"
    ]
)
@Import(MultiFoo::class)
class ComponentConfiguration {
}