package pzn.spring.core.service

import lombok.Getter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import pzn.spring.core.repository.ProductRepository

//@Scope("prototype")
//@Lazy
@Component
class ProductService{
    @Getter
    final var productRepository: ProductRepository

    @Autowired
    constructor(productRepository: ProductRepository){
        this.productRepository = productRepository
    }

    constructor(productRepository: ProductRepository, name: String){
        this.productRepository = productRepository
    }
}