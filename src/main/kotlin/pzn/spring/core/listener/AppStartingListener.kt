package pzn.spring.core.listener

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationStartingEvent
import org.springframework.context.ApplicationListener
import kotlin.math.log

@Slf4j
class AppStartingListener : ApplicationListener<ApplicationStartingEvent> {
    private val logger = LoggerFactory.getLogger(AppStartingListener::class.java)

    override fun onApplicationEvent(event: ApplicationStartingEvent) {
        logger.info("Application Starting")
    }
}