package oop.abstrInterface.car

fun main() {
    val input = readln().trim()
    if (input == "drive") {
        val car: Car = Car()
        car.drive()
    }
}