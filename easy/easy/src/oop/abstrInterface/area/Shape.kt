package oop.abstrInterface.area

abstract class Shape {
    abstract fun area(): Double
}

fun main() {
    val input = readln().trim()
    if (input == "circle") {
        val radius = readln().toDouble()
        val circle = Circle(radius)
        println("Area: ${circle.area()}")
    } else {
        val sideA = readln().toDouble()
        val sideB = readln().toDouble()
        val rectangle = Rectangle(sideA,sideB)
        println("Area: ${rectangle.area()}")
    }
}

