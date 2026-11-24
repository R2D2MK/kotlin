package oop.car

class Car (
    val brand: String,
    val year: Int
) {
    fun printDetails(): String {
        return ("Brand: $brand, Year: $year ")
    }
}
