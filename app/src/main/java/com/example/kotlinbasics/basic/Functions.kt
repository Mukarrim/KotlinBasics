fun main(args : Array<String>) {
   var num=16
    val number1 = 12.44
    val number2 = 55.22

    val result: Int

    result= addNumbers(number1)
    println("The value is = $result")


    /**
     * Standard library functions
     */
    println("Square root of $num: ${Math.sqrt(num.toDouble())}")
    sayHello()


}

/**
 * User  defined function without arguments
 */
fun sayHello(){
    println("Hello")
}

fun addNumbers(n1 : Double, n2: Double=44.22):Int{
    val sum= n1+ n2
    val sumNumber = sum.toInt()
    return sumNumber
}
