package com.example.kotlinbasics.advnaced.singleton

/**
 * Use object keyword
 * How do you declare singleton in Kotlin
 */
object SingletonDemo
{
    init {
        println("Singleton class invoked")
    }
    var employee= "Tom"
    fun printEmplyee(){
        println(employee)
    }
}
fun main(args: Array<String>){
    println(SingletonDemo.javaClass)
    SingletonDemo.printEmplyee()
    var demo= Demo()
}


class Demo{
    init {
        println("Inside class invoked: ${SingletonDemo.employee}")
        SingletonDemo.printEmplyee()
    }
}