package com.example.kotlinbasics.codingchallenges

object CreditCardLogic {
    /*
    * ACME 1121
    * ALFA 1111
    * AMEX 3796
    *
    * -> 1121-0000-0000-0312  -- Expiry Date (03/12)
    * -> First 4 digit represent company
    * -> Last 4 digit represent expiry date
    *
    *
    * */


    fun validateInput(inputCard: String, inputExpiryDate: String): Boolean {
        return inputCard.takeLast(4) == inputExpiryDate.replace("/", "")
    }

}