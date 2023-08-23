package pzn.spring.core.commandapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class CommandApplication {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            SpringApplication.run(CommandApplication::class.java, *args)
        }
    }
}