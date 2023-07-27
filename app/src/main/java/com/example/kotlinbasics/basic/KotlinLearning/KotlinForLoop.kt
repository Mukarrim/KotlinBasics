package com.example.kotlinbasics.basic.KotlinLearning

fun main() {
    //Exercise 1

    for(i in 1..5){
        println(i)
    }

    //Simpler way of iterating the above loop

    for(i in 1..5) println(i)
    println("")
    //Other iteration examples
    println("")
    for(i in 5..1) println(i) //Will print nothing as the syntax is not correct
    println("")
    for (i in 5 downTo 1) println(i) //The correct way of getting a range in descending order is by using DOWNTO!!
    println("")
    for (i in 1..10 step 2) println(i)
    println("")
    for(i in 5 downTo 1 step 2) println(i)

    // Iterating through an array

    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for(item in language){
        println(item)
    }

    //Iterating through array using the index
    for(item in language.indices){
        if(item%2==0){
            println(language[item])
        }
    }
}