package challenges


/*
* Tasks: Write a Singleton class in Kotlin and add a string "ABB" to make substrings of it.
* */

fun main() {
    val substrings = MySingleton.getSubstrings()
    for (substring in substrings) {
        println(substring)
    }
}


object MySingleton {
    val myString = "ABB"

    fun getSubstrings(): List<String> {
        val substrings = mutableListOf<String>()
        for (i in myString.indices) {
            for (j in (i + 1)..myString.length) {
                substrings.add(myString.substring(i, j))
            }
        }
        return substrings
    }
}