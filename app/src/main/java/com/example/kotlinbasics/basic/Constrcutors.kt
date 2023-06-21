package com.example.kotlinbasics.basic

/**
 * Two types
 * Primary- 0,1
 * Secondary- 1...
 *
 */
fun main(args: Array<String>) {
    // val add = Sum(3, 8)
    // println("The value is ${add.c}")

    val emp = employee(21323, "Jim")
    val emplyee2 = employee()
}
//class Sum constructor(a:Int, b:Int)
//{
//    var c= a+b
//}

class employee(emp_id: Int = 7, emap_name: String = "Bond") {
    val id: Int
    var name: String

    // initializer block
    init {
        id = emp_id
        name = emap_name
        println(" Employee id is $id")
        println(" Employee name is $name")
    }
}
