package pzn.spring.core.processor

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.core.Ordered
import org.springframework.stereotype.Component
import pzn.spring.core.aware.IdAware
import java.util.UUID

@Slf4j
@Component
class IdGeneratorBeanPostProcessor : BeanPostProcessor, Ordered {

    private val logger = LoggerFactory.getLogger(IdGeneratorBeanPostProcessor::class.java)

    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
        logger.info("Id Generator Processor for Bean $beanName")
        if (bean is IdAware){
            logger.info("Set Id Generator for Bean $beanName")
            val idAware = bean
            idAware.setId(UUID.randomUUID().toString())
        }

        return bean
    }

    override fun getOrder(): Int {
        return 1
    }
}