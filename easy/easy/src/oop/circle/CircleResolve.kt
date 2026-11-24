package oop.circle

fun main() {
    val inputRadius = readln().toDouble()
    val circle: Circle = Circle(radius = inputRadius)

    circle.calculateArea()
    circle.printResult()
}
