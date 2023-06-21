package com.example.kotlinbasics.advnaced.extension

import android.media.Image

class Circle(val radius: Double) {
    fun area(): Double {
        return Math.PI * radius * radius
    }
}

/**
 * Extension functions
 */
fun Circle.perimeter(): Double {
    return 2 * Math.PI * radius
}

fun Circle.myNewFormula(): Double {
    return 12 * radius
}


fun main(args: Array<String>) {
    val circle = Circle(5.5)
    val area = circle.area()
    println("The area is ----${area}")

    val peri = circle.perimeter()
    println("The perimter is -----${peri}")

    val newValue = circle.myNewFormula()
    println("The newValue is -----${newValue}")

}
