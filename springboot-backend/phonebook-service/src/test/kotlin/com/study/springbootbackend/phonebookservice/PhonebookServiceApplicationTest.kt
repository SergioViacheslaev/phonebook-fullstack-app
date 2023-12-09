package com.study.springbootbackend.phonebookservice

import com.study.springbootbackend.model.dto.PhoneContactResponseDto
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`

class PhonebookServiceApplicationTest {

    @Test
    fun testMockito() {
        val phoneContactResponseDto = Mockito.mock(PhoneContactResponseDto::class.java)

        `when`(phoneContactResponseDto.firstName).thenReturn("Bar")

        assertEquals("Bar", phoneContactResponseDto.firstName)
    }
}