package pzn.spring.core.listener

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import pzn.spring.core.event.LoginSuccessEvent

@Slf4j
@Component
class UserListener {
    private val logger = LoggerFactory.getLogger(UserListener::class.java)

    @EventListener(classes = [LoginSuccessEvent::class])
    fun onLoginSuccessEvent2(event: LoginSuccessEvent){
        logger.info("Success login for user ${event.user}")
    }

    @EventListener(classes = [LoginSuccessEvent::class])
    fun onLoginSuccessEvent3(event: LoginSuccessEvent){
        logger.info("Success login for user ${event.user}")
    }

    @EventListener(classes = [LoginSuccessEvent::class])
    fun onLoginSuccessEvent4(event: LoginSuccessEvent){
        logger.info("Success login for user ${event.user}")
    }
}