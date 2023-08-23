package pzn.spring.core.service

import lombok.Getter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import pzn.spring.core.repository.CustomerRepository

@Component
class CustomerService {

    @Getter
    @Autowired
    @Qualifier("normalCustomerRepository")
    lateinit var normalCustomerRepository: CustomerRepository

    @Getter
    @Autowired
    @Qualifier("premiumCustomerRepository")
    lateinit var premiumCustomerRepository: CustomerRepository
}