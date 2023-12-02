package com.study.springbootbackend.phonebookservice

import com.study.springbootbackend.model.PhoneContact
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PhonebookServiceApplication : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("Hello world")
        val phoneContact = PhoneContact("Mops")
        println("contact is $phoneContact")
    }
}

fun main(args: Array<String>) {
    runApplication<PhonebookServiceApplication>(*args)
}
