package com.example.kotlinbasics.advnaced.higherof

fun main(args: Array<String>) {
// expression without function name
    // {parametrs of the functions-> return type}
    val callFun = { println("Happy Birthday") }
    println(callFun())

    //val add= {addNumbers(3,6)}
    val addLambda = { a: Int, b: Int -> a + b }
    println(addLambda(4, 6))

}

//fun greetings(){
//    println("Happy Birthday")
//}
//
//fun addNumbers(a:Int, b:Int):Int{
//    println(a+b)
//    return a+b
//}