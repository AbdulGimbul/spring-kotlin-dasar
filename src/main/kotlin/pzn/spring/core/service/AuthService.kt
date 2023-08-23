package pzn.spring.core.service

import lombok.Getter
import org.springframework.beans.BeansException
import org.springframework.beans.factory.BeanNameAware
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component

@Component
class AuthService : ApplicationContextAware, BeanNameAware{

    final var beanName: String? = null
        private set

    final var applicationContext: ApplicationContext? = null
        private set

    @Throws(BeansException::class)
    override fun setApplicationContext(applicationContext: ApplicationContext) {
        this.applicationContext = applicationContext
    }

    override fun setBeanName(name: String) {
        beanName = name
    }
}