package pzn.spring.core

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import pzn.spring.core.cyclic.CyclicA
import pzn.spring.core.cyclic.CyclicB
import pzn.spring.core.cyclic.CyclicC

@Configuration
class CyclicConfiguration {

    @Bean
    fun cyclicA(cyclicB: CyclicB): CyclicA{
        return CyclicA(cyclicB)
    }

    @Bean
    fun cyclicB(cyclicC: CyclicC): CyclicB{
        return cyclicB(cyclicC)
    }

    @Bean
    fun cyclicC(cyclicA: CyclicA): CyclicC{
        return cyclicC(cyclicA)
    }
}