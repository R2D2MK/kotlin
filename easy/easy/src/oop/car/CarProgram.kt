package oop.car

fun main() {
    val carValue = readln().toInt()
    repeat(carValue){
        val (brand, year) = readln().split(" ")
        val yearInt = year.toInt()
        val carMy = Car(brand, yearInt)
        println(carMy.printDetails())
    }
}