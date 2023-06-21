package com.example.kotlinbasics.advnaced.collections

fun main() {
    val scores = mapOf("Alice" to 90, "Bob" to 85, "Charlie" to 85)
//    scores["Bob"] = 123  // cannot modify
    println(scores["Bob"])

    val ages = mutableMapOf("Alice" to 90, "Bob" to 85, "Charlie" to 85)
    ages["Bob"] = 123  // can modify
    ages["Dave"] = 95
    println(ages)
}