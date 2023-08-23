package pzn.spring.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import pzn.spring.core.data.Car
import pzn.spring.core.processor.IdGeneratorBeanPostProcessor

class BeanPostProcessorTest {

    @Configuration
    @Import(
        Car::class, IdGeneratorBeanPostProcessor::class
    )
    class TestConfiguration{

    }

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp(){
        applicationContext = AnnotationConfigApplicationContext(TestConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testCar(){
        val car = applicationContext.getBean(Car::class.java)

        println(car.getId())
        Assertions.assertNotNull(car.getId())
    }
}

