package testFinal

fun main() {
    val input = readln()
    val filter = input.filter { it != '5' && it != '7' }
    println(filter)
}