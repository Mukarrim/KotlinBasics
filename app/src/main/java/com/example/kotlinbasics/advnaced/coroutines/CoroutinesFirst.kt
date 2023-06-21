package com.example.kotlinbasics.advnaced.coroutines

import kotlinx.coroutines.*

/**
 * 1 Four Main methods
 * 2 Dispatchers
 * 3 What is suspend
 */
fun main() {
    GlobalScope.launch { // launch a new coroutine in background and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
        println("launch: Working in thread ${Thread.currentThread().name}")

    }
    println("Hello,") // main thread continues while coroutine is delayed
    println("outside: Working in thread ${Thread.currentThread().name}")

    // Step 1
    //Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive

    /**
     * The result is the same, but this code uses only non-blocking delay.
     * The main thread invoking runBlocking blocks until the coroutine inside runBlocking completes.
     * runBlocking<Unit> { ... } works as an adaptor that is used to start the top-level main coroutine.
     */
    runBlocking {
        delay(2000L)
        println("London!") // print after delay
        println("runBlocking: Working in thread ${Thread.currentThread().name}")

    }
}