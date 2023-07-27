package Kotlin1603Class.ScopeFunctions

fun main() {
    //With function returns the lambda result. The context-object is 'this'.

    var person = PersonWith()
    /*println(person.firstName)
    println(person.age)*/
    val personInfo: String = with(person){
        println(this.firstName)
        println(this.age)

        age+10
        "I love the game of football"
    }
    println(personInfo)

}

class PersonWith{
    var firstName: String = "Elena Wilson"
    var age: Int = 28
}
