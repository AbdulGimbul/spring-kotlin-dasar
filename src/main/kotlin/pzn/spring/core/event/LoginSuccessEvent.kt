package pzn.spring.core.event

import org.springframework.context.ApplicationEvent
import pzn.spring.core.data.User

class LoginSuccessEvent : ApplicationEvent {

    var user: User? = null
        private set

    constructor(user: User) : super(user) {
        this.user = user
    }
}