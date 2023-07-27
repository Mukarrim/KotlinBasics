package com.example.kotlinbasics.basic

fun main() {

    //Exercise 1

    /*val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")*/

    //Exercise 2

    /*val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    when (operator) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operator is invalid")
    }*/

    //Exercise 3

    /*val n = -1

    when(n){
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero.")
        -1, -2 -> println("n is a negative integer greater than 3.")
    }*/

    //Exercise 4

    val x = 100

    when(x){
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100.")
    }

    //Exercise 5

    val a = 11
    val n = "11"

    when (n) {
        "cat" -> println("Cat? Really?")
        12.toString() -> println("Close but not close enough.")
        a.toString() -> println("Bingo! It's eleven.")
    }
}