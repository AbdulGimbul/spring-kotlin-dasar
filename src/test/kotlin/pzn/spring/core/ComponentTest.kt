package pzn.spring.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pzn.spring.core.data.MultiFoo
import pzn.spring.core.repository.CategoryRepository
import pzn.spring.core.repository.CustomerRepository
import pzn.spring.core.repository.ProductRepository
import pzn.spring.core.service.CategoryService
import pzn.spring.core.service.CustomerService
import pzn.spring.core.service.ProductService

class ComponentTest {

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(ComponentConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testService(){

        val productService1 = applicationContext.getBean(ProductService::class.java)
        val productService2 = applicationContext.getBean("productService", ProductService::class.java)

        Assertions.assertSame(productService1, productService2)
    }

    @Test
    fun testConstructorDependencyInjection(){
        val productService = applicationContext.getBean(ProductService::class.java)
        val productRepository = applicationContext.getBean(ProductRepository::class.java)

        Assertions.assertSame(productRepository, productService.productRepository)
    }

    @Test
    fun testSetterDependencyInjection(){
        val categoryService = applicationContext.getBean(CategoryService::class.java)
        val categoryRepository = applicationContext.getBean(CategoryRepository::class.java)

        Assertions.assertSame(categoryRepository, categoryService.categoryRepository)
    }

    @Test
    fun testFieldDependencyInjection(){

        val customerService = applicationContext.getBean(CustomerService::class.java)

        val normalCustomerRepository = applicationContext.getBean("normalCustomerRepository",CustomerRepository::class.java)
        val premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository",CustomerRepository::class.java)

        Assertions.assertSame(normalCustomerRepository, customerService.normalCustomerRepository)
        Assertions.assertSame(premiumCustomerRepository, customerService.premiumCustomerRepository)
    }

    @Test
    fun testObjectProvider(){
        val multiFoo = applicationContext.getBean(MultiFoo::class.java)
        Assertions.assertEquals(3, multiFoo.foos.size)
    }
}