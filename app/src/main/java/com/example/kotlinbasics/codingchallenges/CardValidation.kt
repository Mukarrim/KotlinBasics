package com.example.kotlinbasics.challenges

import androidx.core.text.isDigitsOnly

class CardValidation {
    /*
    * Banks
    *
    * ACME 1121
    * ALFA 1111
    * AMEX 3796
    *
    * Sample input
    * -> 1121-0000-0000-0312  -- Expiry Date (03/12)
    * -> First 4 digit represent company
    * -> Last 4 digit represent expiry date
    *
    *Assuming card and date as input write a function to verify valid card numbers
    * */

    /*
    * - Chiril -> handle null or empty / Card Length / Expiry date is already gone
    * - Felix -> Check if the card number is in right pairs of 4
    * - Priyanka -> same as Aren
    * - Aren -> Improve test cases to verify all cases
    * - Kevon -> same Chiril
    * */

    val ACME = "1121"
    val ALFA = "1111"
    val AMEX = "3796"

    fun validate(
        card: String,
        expiryDate: String
    ) = if (
        card.take(4) == ACME
        || card.take(4) == ALFA
        || card.take(4) == AMEX
    ) {
        detailsValidator(card)
        lettersCheck(card)
        validateValidCardLength(card)
        validateDate(expiryDate, card)
    } else {
        false
    }
    // TDD
    fun validateDate(expiryDate: String, card: String) =
        //expiry date replace
        expiryDate.replace("/", "") == card.takeLast(4)

    fun detailsValidator(card: String) = card != null && card.isNotEmpty()
    fun validateValidCardLength(card: String) = card.replace("-", "").length == 16
    fun lettersCheck(card: String) = card.replace("-", "").all{ chars -> chars.isDigit()
    }

    fun detailsValidator2(card: String):Boolean{
        var result = false
        if(card.isNotEmpty()){
            // card length  valid
            card.replace("-","")
            card.take(card.length)
            if (card.length == 16){

                if (card.isDigitsOnly()){
                    card.replace("....".toRegex(),"-")
                    card.dropLast(1)
                    println(card)
                    return true
                }

            }

        }
        return false

    }

}

