package com.study.springbootbackend.phonebookservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PhonebookServiceApplication

fun main(args: Array<String>) {
    runApplication<PhonebookServiceApplication>(*args)
}
