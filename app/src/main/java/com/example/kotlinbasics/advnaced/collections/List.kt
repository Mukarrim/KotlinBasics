package com.example.kotlinbasics.advnaced.collections

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)  //cannot modify / immutable
    println(numbers[3])

    val names = mutableListOf("adam", "someone", "noone", "anyone") // can modify / mutable
    names.add("somebody")
    println(names)

    val namesSorted = names.sorted()  // default functions with Collections
    val namesFilter = names.filter{it.contains("adam")}  // default functions with Collections
    val filterTest = numbers.filter{ it / 3 == 0}  // default functions with Collections
    val namesFind = names.find{it.contains("adam")}  // default functions with Collections
    println(namesSorted)
}