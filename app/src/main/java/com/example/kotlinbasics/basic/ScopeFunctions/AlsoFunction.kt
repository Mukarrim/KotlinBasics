package Kotlin1603Class.ScopeFunctions

fun main(args: Array<String>) {
    //Also function returns the context object, which can be reffered by using 'it'.
    val person = PersonApply().apply {
        firstName = "Eden Elenwoke"
        age = 22
    }
    with(person){
        println(firstName)
        println(age)
    }

    person.also{
        it.firstName = "Eden Peter"
        println("My new name is: + ${it.firstName}")
    }
}

class PersonApply{
    var firstName: String = "Elena Wilson"
    var age: Int = 28
}