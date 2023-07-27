package Kotlin1603Class.ScopeFunctions

fun main() {

    //Used to prevent a 'NullPointerException', returning the lambda result. It uses the context-object 'it'.

    //val name: String? = null
    val name: String? = "Vlad"

    name?.let{
        println(it.reversed())
        println(it.length)
    }
    /*println(name!!.reversed())
    println(name.length)*/
}