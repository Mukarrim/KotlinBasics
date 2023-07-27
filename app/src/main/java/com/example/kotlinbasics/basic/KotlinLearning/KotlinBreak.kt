package com.example.kotlinbasics.basic.KotlinLearning

fun main(){
    //Example 1 of Kotlin Break
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }

    //Break labels are used to break a specific loop. Works with nested loops.

    first@ for (i in 1..4) {

        second@ for (j in 1..2) {
            println("i = $i; j = $j")

            if (i == 2)
                break@first
        }
    }
}