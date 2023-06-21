package com.example.kotlinbasics.advnaced.nullsafety

/**
 * 1 Safe call (?)
 * 2 Elvis (?:)
 * 3 !!- Exception in thread "main" kotlin.KotlinNullPointerException
 * 4 let operator
 */
fun main(args : Array<String>) {
    var cusID: Int?= null
   // cusID=null
    println("${cusID}")

    val a = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length) // Unnecessary safe call
    //val l = b!!.length
    println(b!!.length) // Unnecessary safe call



}