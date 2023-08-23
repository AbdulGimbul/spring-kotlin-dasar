package pzn.spring.core.service

import lombok.Getter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import pzn.spring.core.repository.CategoryRepository

@Component
class CategoryService {

    @Autowired
    lateinit var categoryRepository: CategoryRepository
}