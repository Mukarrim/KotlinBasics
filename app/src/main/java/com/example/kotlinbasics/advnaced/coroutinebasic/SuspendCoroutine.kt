package com.example.kotlinbasics.advnaced.coroutinebasic

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/*
* In this example, the doSomething function is a suspend function, which means it can be paused and resumed as needed.
* */
suspend fun doSomething(): String {
    delay(1000L)
    return "Hello from suspend function!"
}

fun main() = runBlocking {
    val result = doSomething()
    println(result)
}