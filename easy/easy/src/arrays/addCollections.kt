package arrays

fun main() {
    val input = readln()
    val collection = mutableListOf<String>()
    collection.addAll(input.split(" "))
    println(collection.reversed().joinToString(separator = " "))
}

