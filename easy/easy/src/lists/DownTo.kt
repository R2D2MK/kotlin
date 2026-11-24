package lists

fun main() {
    val input = readln().toInt()

    val fruits = mutableListOf<String>()
    repeat(input) {
        fruits.add(readln().toString())
    }
        for ( i in fruits.lastIndex downTo 0)
        println(fruits[i])
    }
