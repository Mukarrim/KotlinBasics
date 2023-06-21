package com.example.kotlinbasics.codingchallenges

import java.util.*

/*
* extract vowels from list and return only those from each word
*
* input list -> adam, omar, chris, someone
* output list-> aa, oa, i, oeoe
* */

fun main() {
    val words = listOf("adam", "omar", "chris", "someone", "nobody")
    val vowels = extractVowels(words)
    println(vowels) // Output: [aa, oa, i, oeoe]
    println(extractVowelsHigherOrder(words)) // Output: [aa, oa, i, oeoe]
}

fun extractVowelsHigherOrder(words: List<String>): List<String> {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return words.map { word ->
        word.lowercase(Locale.getDefault()).filter { it in vowels }
    }
}

fun extractVowels(words: List<String>): List<String> {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val result = mutableListOf<String>()

    for (word in words) {
        val wordVowels = StringBuilder()
        for (c in word.lowercase(Locale.getDefault())) {
            if (c in vowels) {
                wordVowels.append(c)
            }
        }
        result.add(wordVowels.toString())
    }

    return result
}