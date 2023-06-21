package KotlinOOP

class Person {
    val fName: String
    var personAge: Int

    constructor(fName: String, personAge: Int) {
        this.fName = fName
        this.personAge = personAge
        firstName = fName.capitalize()
        age = personAge
        println("First Name is $firstName")
        println("Age is $age")
    }

    val firstName: String
    var age: Int

}

class Dog(_breed: String = "N/A", _name: String = "Unkown",_age: Int = 0){
    val breed = _breed.capitalize()
    val name = _name
    var age = _age

    init{
        println("This dog is a $breed, his name is $name and it is $age years old!")
    }
}

fun main(){
    val person1 = Person("Joe", 25)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")

    val dog1 = Dog("Chiuaua", "Little", 25)
}