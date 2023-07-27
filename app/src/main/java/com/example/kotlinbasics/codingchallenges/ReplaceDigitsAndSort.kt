package com.example.kotlinbasics.challenges

//Three inputs where
//-> Number of digits
//-> Array of digits exactly count of first input separated by space
//-> Digit to replace/sort to start
//Given:
//-> All the inputs will be in String
//-> The Array passed in second in put will be separated by space
//-> All the inputs will be digits
//Requirements:
//-> You replace the number/digit in ARRAY with 1
//-> All the 1s should be at start of the list (Sorted)

//Sample Input:
//6
//2 3 6 2 3 2
//2

//Expected Output:
//111363
//Steps for example only
//(2 3 6 2 3 2)
//(1 3 6 2 3 2)
//(1 1 3 6 3 2)
//(1 1 1 3 6 3)



fun scratch(numDigits: String, digits: String, replaceWith: String): String {
    // Convert input strings to integers
    val numDigits = numDigits.toInt()
    val replaceWith = replaceWith.toInt()

    // Convert input string to list of integers
    val digitsList = digits.split(" ").map { it.toInt() }

    // Replace all occurrences of `replaceWith` with 1
    val replacedList = digitsList.map { if (it == replaceWith) 1 else it }

    // Sort the list so that all the 1s are at the start of the list
    val sortedList = replacedList.sortedBy { if (it == 1) 0 else 1 }

    // Convert the list back into a string, with each element separated by a space
    return sortedList.joinToString(" ")
}
fun main() {
    val numDigits = "6"
    val digits = "2 3 6 2 3 2"
    val replaceWith = "2"
    val result = scratch(numDigits, digits, replaceWith)
    println(result)
}