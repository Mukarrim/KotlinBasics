package Kotlin1603Class.ScopeFunctions
/*
Scope functions:
    -> LET : mostly used for null safety and lets you access the object inside a lambda
    -> RUN : lets you handle execs tasks/code/lambda functions with keeping the context/reference
    -> WITH : lets you acces the object/value(array/list) and directly use its functions
    -> APPLY : lets you modify an object's value without having to repeat it
    -> ALSO : execute code commands in a sequential order. You can access the object using 'it' keyword.

    Null Safety Operator -> '?.' provides you safety from null values
    Elvis Operator -> '?:' gives an alternate value to be used instead of null
    Safe Operator -> '?' - used as a safe call
    Force Operator -> '!!' - forces the system to ignore null warnings
 */
fun main( ) {
    var nullString: String? = null // question mark should be used as a null safety operator in order to be able to assign null to a variable.
    val newValue: String = nullString ?: "alternate"

    println(newValue)

    nullString = "New Value here!"

    nullString?.let {
        println(nullString)
    }

    val person = Person(
        "first",
        "second",
        "third",
        "fourth"
    )

    person.apply {
        firstName = "a"
        lastName = "b"

    }
}

data class Person(
    var firstName: String,
    var lastName: String,
    var firstName1: String,
    var lastName1: String
){

}