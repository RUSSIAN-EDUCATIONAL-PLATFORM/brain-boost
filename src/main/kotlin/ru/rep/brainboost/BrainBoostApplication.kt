package ru.rep.brainboost

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BrainBoostApplication

fun main(args: Array<String>) {
	runApplication<BrainBoostApplication>(*args)
}
