package oop.abstrInterface.guitar

fun main() {
    val input = readln().trim()
    if (input == "play") {
        val guitar = Guitar()
        guitar.play()
    }
}