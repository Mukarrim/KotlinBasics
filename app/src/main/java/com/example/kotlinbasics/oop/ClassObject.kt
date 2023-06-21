package com.example.kotlinbasics.oop

/*
* A class Person is defined with two properties name and age.
* An object of this class is created and its properties are accessed and printed.
* */
class Person(val name: String, val age: Int)

fun main() {
    val person = Person("John Doe", 30)
    println("Name: ${person.name}, Age: ${person.age}")
}
