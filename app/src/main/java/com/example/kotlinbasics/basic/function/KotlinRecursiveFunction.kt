package KotlinFunctions

import java.math.BigInteger

fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n*factorial(n-1)
}

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n-1, b, a+b)
}

fun main() {

    //Recursive function is a function that calls itself.

    val number = 5
    val result: Long
    result = factorial(number)
    println("Factorial of $number = $result")

    val n =  10
    val first = BigInteger("0")
    val second = BigInteger("1")
    println(fibonacci(n, first, second))

}