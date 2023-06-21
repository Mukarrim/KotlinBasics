package com.example.kotlinbasics

import com.example.kotlinbasics.codingchallenges.CreditCardLogic
import org.junit.Assert.assertTrue
import org.junit.Test

class CreditCardLogicTest {

    @Test
    fun testValidCardDetails() {
        val inputCard = "1121-0000-0000-0312"
        val inputExpiryDate = "03/12"

        assertTrue(CreditCardLogic.validateInput(inputCard, inputExpiryDate))
    }

    @Test
    fun testValidDateDetails() {
        val inputCard = "1121-0000-0000-0312"
        val inputExpiryDate = "03/12"

        assertTrue(CreditCardLogic.validateInput(inputCard, inputExpiryDate))
    }


}