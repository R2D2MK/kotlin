package oop.abstrInterface.area

class Rectangle(val sideA: Double, val sideB: Double): Shape() {
    override fun area(): Double {
        return sideA * sideB
    }
}