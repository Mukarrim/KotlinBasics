package com.example.kotlinbasics.basic

class ClassDemo {
    //property
    // member function
    var name: String = "";
    var age: Int = 0;
    fun insertName(n: String) {
        this.name = n
    }

    fun insertValues(n: String, a: Int) {
        this.name = n
        this.age = a
        println("Name is $name")
        println("Age is $age")
    }
}

fun main(args: Array<String>) {
// Java
    // ClassDemo class demo= new ClassDemo();
    // DO NOT HAVE A NEW() IN KOTLIN
    // creating objects of a class
    var obj = ClassDemo()
    obj.insertName("Tom")
    println("The name set is: ${obj.name}")

    var obj2 = ClassDemo()
    obj2.insertValues("John", 45)

}