package com.example.kotlinbasics.advnaced.coroutines
import kotlinx.coroutines.*

fun main() {
    // Start a coroutine
    GlobalScope.launch {
        println("In start : working in thread ${Thread.currentThread().name}")
       // Thread.sleep(200)
        delay(200)
        println("In ended : working in thread ${Thread.currentThread().name}")
    }
//    runBlocking {
//
//        launch {
//            println("In start : working in thread ${Thread.currentThread().name}")
//            Thread.sleep(200)
//            println("In ended : working in thread ${Thread.currentThread().name}")
//        }

        run {
            println("Out start:working in thread ${Thread.currentThread().name}")
            Thread.sleep(300)
            println("Out ended: working in thread ${Thread.currentThread().name}\"")
        }
    }
