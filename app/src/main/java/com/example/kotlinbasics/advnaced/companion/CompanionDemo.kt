package com.example.kotlinbasics.advnaced.companion

//public static final String BASE_URL= "HTTP://CAKES";

object GlobalAccess {
    var employeeID: Int= 10044

    @JvmStatic fun callEmplyee2() {
        println(employeeID)
    }

    fun callEmplyee(){
        println(employeeID)
    }

}


class CompanionDemo{
    val name = ""
    val name1 = ""
    private val email = ""
    companion object {
        var employeeID: Int= 10044

        @JvmStatic fun callEmplyee2() {
            println(employeeID)
        }

        fun callEmplyee(){
            println(employeeID)
        }

    }
}
fun main(args: Array<String>){
    val obj = CompanionDemo()

//    println(CompanionDemo.name)
    println(CompanionDemo.employeeID)
    println(CompanionDemo.callEmplyee())
    println(CompanionDemo.callEmplyee2())
}