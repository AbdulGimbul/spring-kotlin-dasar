package pzn.spring.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class CyclicTest {

    @Test
    fun testCyclic(){

        Assertions.assertThrows(Throwable::class.java){
            val context = AnnotationConfigApplicationContext(CyclicConfiguration::class.java)
        }
    }
}