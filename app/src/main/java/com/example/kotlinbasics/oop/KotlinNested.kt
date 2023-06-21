package KotlinOOP

class Outer {

    val a = "Outside Nested class."

    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    // accessing member of Nested class
    println(Outer.Nested().b)

    // creating object of Nested class
    val nested = Outer.Nested()
    println(nested.callMe())
}