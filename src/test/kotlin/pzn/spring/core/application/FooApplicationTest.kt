package pzn.spring.core.application

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import pzn.spring.core.data.Foo

@SpringBootTest(classes = [FooApplication::class])
class FooApplicationTest{

    @Autowired
    lateinit var foo: Foo

    @Test
    fun testSpringBoot(){
        Assertions.assertNotNull(foo)
    }
}