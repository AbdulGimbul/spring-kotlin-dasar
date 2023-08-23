package pzn.spring.core.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import pzn.spring.core.repository.CustomerRepository

@Configuration
class CustomerConfiguration {

    @Primary
    @Bean
    fun normalCustomerRepository(): CustomerRepository{
        return CustomerRepository()
    }

    @Bean
    fun premiumCustomerRepository(): CustomerRepository{
        return CustomerRepository()
    }
}