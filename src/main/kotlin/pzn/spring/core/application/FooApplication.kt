package pzn.spring.core.application

import org.springframework.boot.Banner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.Bean
import pzn.spring.core.data.Bar
import pzn.spring.core.data.Foo
import pzn.spring.core.listener.AppStartingListener

@SpringBootApplication
class FooApplication {

    @Bean
    fun foo(): Foo {
        return Foo()
    }

    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//
//            val applicationContext: ConfigurableApplicationContext =
//                SpringApplication.run(FooApplication::class.java, *args)
//
//            val foo = applicationContext.getBean(Foo::class.java)
//            println(foo)
//        }

        @JvmStatic
        fun main(args: Array<String>){
            val application = SpringApplication(FooApplication::class.java)
            application.setBannerMode(Banner.Mode.OFF)
            application.setListeners(listOf(AppStartingListener()))

            val applicationContext: ConfigurableApplicationContext = application.run(*args)

            val foo =applicationContext.getBean(Foo::class.java)
            println(foo)
        }
    }
}