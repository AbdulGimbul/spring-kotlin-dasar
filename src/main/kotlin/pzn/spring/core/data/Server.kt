package pzn.spring.core.data

import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
import org.slf4j.LoggerFactory
import pzn.spring.core.BeanConfiguration

class Server {
    private val logger = LoggerFactory.getLogger(BeanConfiguration::class.java);

    @PostConstruct
    fun start(){
        logger.info("Start server")
    }

    @PreDestroy
    fun stop(){
        logger.info("Stop server")
    }
}