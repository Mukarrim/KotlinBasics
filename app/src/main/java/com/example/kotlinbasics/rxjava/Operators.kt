package com.example.kotlinbasics.rxjava

import io.reactivex.rxjava3.core.Observable

fun main() {

    /*
    * Operators:
    * Operators are powerful transformation functions that allow you to modify, filter, combine, or control the flow of data emitted by Observables.
    * They enable you to perform various operations on the emitted data, such as filtering, mapping, combining, or performing calculations.
    * Operators help in composing complex data processing pipelines in a clean and declarative manner.
    * */
    // Creating an Observable from a list of items
    val numbers = listOf(1, 2, 3, 4, 5)
    val observable = Observable.fromIterable(numbers)
    // Using the map operator to transform each emitted number to its square
    observable.map { number -> number * number }
        .subscribe { squaredNumber ->
            println("Squared: $squaredNumber")
        }
}