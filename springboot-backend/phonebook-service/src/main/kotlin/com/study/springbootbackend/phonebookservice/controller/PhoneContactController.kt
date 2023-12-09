package com.study.springbootbackend.phonebookservice.controller

import com.study.springbootbackend.model.dto.PhoneContactResponseDto
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/phone-contacts")
@CrossOrigin(origins = ["http://localhost:3000"])
class PhoneContactController {

    private val log = LoggerFactory.getLogger(PhoneContactController::class.java)

    @GetMapping
    fun getPhoneContacts(): List<PhoneContactResponseDto> {
        log.info("Received getPhoneContacts request")
        return listOf(
            PhoneContactResponseDto("Foo", "Bar", 71245543543),
            PhoneContactResponseDto("Alex", "Mops", 71234033543)
        )
    }

    @GetMapping("/{id}")
    fun getPhoneContact(@PathVariable id: String): PhoneContactResponseDto {
        log.info("Received getPhoneContact by id: $id request")
        return PhoneContactResponseDto("Foo", "Bar", 12345)
    }
}



