package com.example.kotlinbasics.oop


/*
* A class Shape is defined with a method area that returns the area of the shape.
* Two classes Circle and Rectangle are defined that inherit from the Shape class and override the area method to return the area of the circle and rectangle, respectively.
* A list of shapes is created and the area method is called for each shape, demonstrating polymorphism.
* */
open class Shape {
    open fun area() = 0.0
}

class Circle(val radius: Double) : Shape() {
    override fun area() = Math.PI * radius * radius
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area() = width * height
}

fun main() {
    val shapes = listOf(Circle(2.0), Rectangle(3.0, 4.0))
    for (shape in shapes) {
        println("Area: ${shape.area()}")
    }
}
