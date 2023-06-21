package com.example.kotlinbasics.advnaced.coroutines

import kotlinx.coroutines.*

//https://kotlinlang.org/docs/reference/coroutines/basics.html
fun main() = runBlocking {
    val deferreds: List<Deferred<Int>> = (2..5).map {
        async {
            delay(1000L * it)
            println("Loading $it")
            return@async it
        }
    }

    val sum = deferreds.awaitAll()
    println("$sum")
}
//fun main() = runBlocking {
//    launch {
//        delay(1000L)
//        println("Later")
//    }
//    println("Now")
//}
