package pzn.spring.core.service

import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.ApplicationEventPublisherAware
import org.springframework.stereotype.Component
import pzn.spring.core.data.User
import pzn.spring.core.event.LoginSuccessEvent

@Component
class UserService : ApplicationEventPublisherAware {

    private lateinit var applicationEventPublisher: ApplicationEventPublisher

    override fun setApplicationEventPublisher(applicationEventPublisher: ApplicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher
    }

    fun login(username: String, password: String): Boolean {
        if (isLoginSuccess(username, password)){
            applicationEventPublisher.publishEvent(LoginSuccessEvent(User(username)))
            return true
        } else {
            return false
        }
    }

    private fun isLoginSuccess(username: String, password: String): Boolean {
        return "abdl".equals(username) && "abdl".equals(password)
    }
}