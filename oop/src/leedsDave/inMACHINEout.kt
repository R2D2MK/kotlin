package leedsDave

fun main() {
    val pi = 3.14
    fun circumference(radius: Double) = 2 * pi * radius
    val circumferenceOfSmallCircle = circumference(5.2)
    val circumferenceOfMediumCircle = circumference(6.7)
    val circumferenceOfLargeCircle = circumference(10.0)
    println(circumferenceOfSmallCircle)
    println(circumferenceOfMediumCircle)
    println(circumferenceOfLargeCircle)
    
}