package pzn.spring.core.data

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import pzn.spring.core.BeanConfiguration

@Slf4j
class Connection : InitializingBean, DisposableBean {
    private val logger = LoggerFactory.getLogger(BeanConfiguration::class.java);


    override fun afterPropertiesSet() {
        logger.info("Connection is ready to be used")
    }

    override fun destroy() {
        logger.info("Connection closed")
    }
}