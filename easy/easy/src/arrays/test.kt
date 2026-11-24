package arrays

fun main() {
    val startNumber = 5
    val input = readln().toInt()
    for ( i in 1..input) {
        val n = startNumber * i
        print("$n ")
    }

}