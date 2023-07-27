package Kotlin1603Class.ScopeFunctions

fun main(args: Array<String>) {
    // Run function returns the lamda result. It uses 'this' keyword. It is a combination of 'with' and 'let'.

    val person: PersonRun? = PersonRun()
    val bio = person?.run {
        println(firstName)
        println(age)
        "LogRocket rocks!!!"
    }
    println(bio)
}

class PersonRun{
    var firstName: String = "Elena Wilson"
    var age: Int = 28
}