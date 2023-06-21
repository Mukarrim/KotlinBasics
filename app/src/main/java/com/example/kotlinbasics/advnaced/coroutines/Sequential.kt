package com.example.kotlinbasics.advnaced.coroutines

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    launch {
        val one = getMeFirstValue()
        val second = getMeSecondValue()
        println("${one + second}")
        println("launch: Working in thread ${Thread.currentThread().name}")
    }

    println("println: Working in thread ${Thread.currentThread().name}")

    // println()
}


suspend fun getMeFirstValue(): Int {
    return 12
}

suspend fun getMeSecondValue(): Int {
    return 33
}
