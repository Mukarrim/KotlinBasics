package KotlinFunctions

fun displayBorder(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
}

fun main() {
    displayBorder('*', 10) //All arguments passed
    displayBorder('/') //Only one argument passed
    displayBorder()//No arguments passed
    displayBorder(length = 20)//Named arguments passed as only one parameter was intended to be used.
}