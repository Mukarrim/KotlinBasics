package com.example.kotlinbasics.codingchallenges

/*
* Having a String entry, identify all the words in that string. Exclude empty spaces, numbers and special characters.
* */


fun main() {
    val inputString = "Hello 123 world! This is a test."
    val words = extractWords(inputString)
    println(words) // Output: [Hello, world, This, is, a, test]
    println(extractWordsRegex(inputString)) // Output: [Hello, world, This, is, a, test]
}

fun extractWordsRegex(inputString: String): List<String> {
    val regex = Regex("[^A-Za-z]+")
    val words = inputString.split(regex)
    return words.filter { it.isNotEmpty() }
}

fun extractWords(inputString: String): List<String> {
    val words = mutableListOf<String>()
    val sb = StringBuilder()

    for (c in inputString) {
        if (c.isLetter()) {
            sb.append(c)
        } else {
            if (sb.isNotEmpty()) {
                words.add(sb.toString())
                sb.clear()
            }
        }
    }

    if (sb.isNotEmpty()) {
        words.add(sb.toString())
    }

    return words
}
