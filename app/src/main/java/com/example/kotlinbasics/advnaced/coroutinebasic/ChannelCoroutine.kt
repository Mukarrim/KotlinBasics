package com.example.kotlinbasics.advnaced.coroutinebasic

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
* In this example, a channel is used to send values from one coroutine to another.
* The first coroutine generates a sequence of numbers and sends them to the channel,
* and the second coroutine receives and prints them.
* */
fun main() = runBlocking {
    val channel = Channel<Int>()
    launch {
        for (x in 1..5) channel.send(x * x)
        channel.close()
    }
    for (y in channel) println(y)
}


/*
* NOTES:
* Coroutines with channels are a way to pass data between different coroutines in a concurrent manner in Kotlin. Channels are used to communicate between coroutines and can be thought of as pipelines that allow you to send and receive values between coroutines.

For example, consider a scenario where you have two coroutines, one that generates numbers and another that consumes the numbers. Instead of using callbacks or other mechanisms, you can use a channel to pass the numbers from the first coroutine to the second. The first coroutine will send the numbers to the channel and the second coroutine will receive the numbers from the channel. This way, the coroutines can run concurrently and communicate with each other through the channel.

This can help simplify the code, as it reduces the need for callbacks or other mechanisms to pass data between coroutines. Channels also provide a way to control the flow of data, ensuring that data is processed in the correct order and avoiding race conditions.
* */