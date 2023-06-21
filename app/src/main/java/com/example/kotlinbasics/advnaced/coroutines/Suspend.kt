package com.example.kotlinbasics.advnaced.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
        GlobalScope.launch(Dispatchers.IO) {
            println("launch: Working in thread ${Thread.currentThread().name}")

        //   val userOne = withContext(Dispatchers.IO) {
//                fetchFirstUser()
//            }
            //show results(userOne)
        }
        println("Hello,")
    println("launch: Working in thread ${Thread.currentThread().name}")

}

suspend fun fetchFirstUser() {

}


// this is your first suspending function
//Suspending functions can be used inside coroutines just like regular functions,
// but their additional feature is that they can, in turn, use other suspending functions (like delay in this example) to suspend execution of a coroutine.
suspend fun doWorld() {
   // delay(1000L)
    println("World!")
    println("suspend: Working in thread ${Thread.currentThread().name}")

}