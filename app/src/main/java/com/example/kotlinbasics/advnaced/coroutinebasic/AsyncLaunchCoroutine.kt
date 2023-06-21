package com.example.kotlinbasics.advnaced.coroutinebasic

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


/*
* the launch function is used to start a coroutine that waits for 1 second and then prints a message.
* The main function continues to run while the coroutine is running in the background.
* */
//fun main() = runBlocking {
//    launch {
//        delay(1000L)
//        println("Hello from launch coroutine!")
//    }
//    println("Hello from main!")
//    delay(2000L)
//}

/*
* the async function is used to create a coroutine that waits for 1 second and then returns a message.
* The await function is used to wait for the result of the coroutine and obtain the message.
* */
fun main() = runBlocking {
    val result = async {
        delay(1000L)
        "Hello from async coroutine!"
    }
    println(result.await())
    println("Hello from main!")
}


/*
* NOTES
* launch is used to start a coroutine and return a Job object that represents the coroutine, while async is used to start a coroutine and return a Deferred object that represents the result of the coroutine.
* */

