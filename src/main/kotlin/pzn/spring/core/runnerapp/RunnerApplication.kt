package pzn.spring.core.runnerapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RunnerApplication {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            SpringApplication.run(RunnerApplication::class.java, *args)
        }
    }
}