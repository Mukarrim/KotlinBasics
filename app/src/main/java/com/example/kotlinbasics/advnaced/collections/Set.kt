package com.example.kotlinbasics.advnaced.collections

fun main() {
    val vowels = setOf('a', 'e', 'i', 'o', 'u') // unique read only / immutable
    println(vowels.contains('e'))

    val fruits = mutableSetOf("apple", "orange", "banana")  //unique can add new elements / mutable
    fruits.add("strawberries")
    fruits.add("banana") //ignored since already exists
    println(fruits)
}