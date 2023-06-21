package com.example.kotlinbasics.codingchallenges

/*
* Replace annotations in a given string with the word they represent.
* input 1 -> "This is an example of a string with annotations like @example1 and @example2."
* input 2 -> "@example1" to "Annotation 1", "@example2" to "Annotation 2"
*
* output  -> This is an example of a string with annotations like Annotation 1 and Annotation 2.

* */

fun main() {
    println(
        replaceAnnotations(
            "This is an example of a string with annotations like @example1 and @example2.",
            mapOf("@example1" to "Annotation 1", "@example2" to "Annotation 2")
        )
    )
}


fun replaceAnnotations(input: String, annotations: Map<String, String>): String {
    var output = input
    for (annotation in annotations) {
        output = output.replace(annotation.key, annotation.value)
    }
    return output
}