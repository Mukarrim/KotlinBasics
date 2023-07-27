package Kotlin1603Class

//Documentation link for Scope Functions
// https://kotlinlang.org/docs/scope-functions.html#function-selection

//Extension functions let you extend a functionality of a Class without having it to inherit it.
//You can use it to extend the function even if used from a different class or package by giving directions to the folder path


fun main() {

    val tester: String? = null

    val obj = CalculateMathProblems()

    val a = 12
    val b = 4

    println(obj.sum(a, b))

}

class CalculateMathProblems{
    fun sum(a: Int, b: Int): Int = a+b
    fun sub(a: Int, b: Int): Int = a-b
    fun div(a: Int, b: Int): Int = a/b



}