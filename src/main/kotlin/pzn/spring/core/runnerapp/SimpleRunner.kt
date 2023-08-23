package pzn.spring.core.runnerapp

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Slf4j
@Component
class SimpleRunner : ApplicationRunner {
    private val logger = LoggerFactory.getLogger(SimpleRunner::class.java)

    override fun run(args: ApplicationArguments?) {
        val profiles: MutableList<String>? = args?.getOptionValues("profiles")
        logger.info("Profiles : ${profiles}")
    }
}