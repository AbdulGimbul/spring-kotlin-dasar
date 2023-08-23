package pzn.spring.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import pzn.spring.core.data.Car
import pzn.spring.core.processor.IdGeneratorBeanPostProcessor
import pzn.spring.core.processor.PrefixIdGeneratorBeanPostProcessor

class OrderedTest {

    @Configuration
    @Import(Car::class, IdGeneratorBeanPostProcessor::class, PrefixIdGeneratorBeanPostProcessor::class)
    class TestConfiguration{
    }

    private lateinit var applicationContext: AnnotationConfigApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(TestConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testCar(){
        val car = applicationContext.getBean(Car::class.java)

        Assertions.assertNotNull(car.getId())
        Assertions.assertTrue(car.getId().startsWith("PZN-"))
    }

}