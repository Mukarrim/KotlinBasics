package KotlinFunctions

class Structure(){
    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}


fun main() {
    //Infix functions lets you create a function that only has one parameter and write it in a simpler way to call it.
    val p = Structure()
    p createPyramid 10

}