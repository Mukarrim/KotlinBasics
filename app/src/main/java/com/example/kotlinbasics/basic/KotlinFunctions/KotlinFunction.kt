package KotlinFunctions

fun callMe(){
    println("Printing from inside the function")
}
fun addNumbers(n1:Double, n2:Double): Int{
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}

fun main() {
    /*
    There are 2 types of functions:
        ->Kotlin Standard Library Functions (eg. .print)
        ->User-defined functions
     */

    //Example of Kotlin Standard Library Function
    var number = 5.5
    println("Result = ${Math.sqrt(number)}")

    //User defined function
    callMe()
    //The function has to be defined outside the main function and can be called inside it.

    //Calling function with parameters
    val result = addNumbers(1.34, 9.53)
    println(result)
}