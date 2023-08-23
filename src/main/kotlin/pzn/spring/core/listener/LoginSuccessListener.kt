package pzn.spring.core.listener

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component
import pzn.spring.core.event.LoginSuccessEvent

@Slf4j
@Component
class LoginSuccessListener : ApplicationListener<LoginSuccessEvent> {
    private val logger = LoggerFactory.getLogger(LoginSuccessListener::class.java)

    override fun onApplicationEvent(event: LoginSuccessEvent) {
        logger.info("Success login for user ${event.user}")
    }
}