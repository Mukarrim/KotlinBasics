// In Kotlin, everything is final by default
// final says class cannot be inherited, methods cannot be overidden
// open keyword
// What is an open keyword
//
 open class baseClass{
    val name= "SpiderMan"
    open fun Sample(){
        println("This is base class")
    }
}
class derivedClass: baseClass(){
    override fun Sample(){
        println("This is base class from derived")
    }
    fun Sample2(){
        println("This is derived class")
    }
}

fun main(args : Array<String>) {
   val derivedClass = derivedClass()
    derivedClass.Sample()
    derivedClass.Sample2()

    val student = Student("Jane Doe", 20, 123)
    println("Name: ${student.name}, Age: ${student.age}, Roll No: ${student.rollNo}")
}

open class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val rollNo: Int) : Person(name, age)
