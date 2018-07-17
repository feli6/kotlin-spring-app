package com.vic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootstrapApp

fun main(args: Array<String>) {
    runApplication<BootstrapApp>(*args)
}
