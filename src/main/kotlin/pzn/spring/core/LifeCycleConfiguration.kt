package pzn.spring.core

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import pzn.spring.core.data.Connection
import pzn.spring.core.data.Server

@Configuration
class LifeCycleConfiguration {

    @Bean
    fun connection(): Connection {
        return Connection()
    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    fun server(): Server {
        return Server()
    }
}