package oop.circle

import kotlin.math.PI

class Circle(
    val radius: Double,
    var area: Double = 0.0
) {

    fun calculateArea() {
        area = PI * radius * radius
    }

    fun printResult(){
        println("Radius: $radius")
        println("Area: $area")
    }
}