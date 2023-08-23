package pzn.spring.core.commandapp

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.util.Arrays

@Slf4j
@Component
class LogCommandLineRunner : CommandLineRunner {
    private val logger = LoggerFactory.getLogger(LogCommandLineRunner::class.java)

    override fun run(vararg args: String?) {
        logger.info("Log Command Line Runner : ${Arrays.toString(args)}")
    }
}