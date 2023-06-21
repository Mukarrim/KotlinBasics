package com.example.kotlinbasics.advnaced.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    /*
    * LAUNCH -> Task execution Linear/Synchronous
    * ASYNC  -> Task execution Parallel/Asynchronous
    *
    * */
    val job = GlobalScope.launch { // launch a new coroutine and keep a reference to its Job
        //delay(1000L)
        println("World!")
    }
    val job1 = GlobalScope.async { // launch a new coroutine and keep a reference to its Job
        //delay(1000L)
        println("World!")
//        "Aren"
//        awaitAll("Aren")
    }
    val job2 = runBlocking { // launch a new coroutine and keep a reference to its Job
        //delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join() // wait until child coroutine completes
}