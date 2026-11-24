package leedsDave

fun main() {
    val distance = 328.1
    val time =  4.15
    val speed = distance / time

}

fun speed(distance: Double, time: Double = 2.0) = distance / time
val averageSpeed = speed(321.8, 4.15)
//Дефолтное значение
val walkingSpeed = speed(10.2)
val bikingSpeed = speed(29.6)
val drivingSpeed = speed(225.3)
val flyingSpeed = speed(1368.747, 1.5)