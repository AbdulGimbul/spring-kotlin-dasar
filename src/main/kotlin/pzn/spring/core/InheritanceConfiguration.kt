package pzn.spring.core

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import pzn.spring.core.service.MerchantServiceImpl

@Configuration
@Import(MerchantServiceImpl::class)
class InheritanceConfiguration {
}