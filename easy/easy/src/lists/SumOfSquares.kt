package lists

fun main() {
    val input = readln().toInt()

    val numbers = mutableListOf<Int>()
    repeat(input) {
        numbers.add(readln().toInt())
    }
    for (i in 0 ..numbers.lastIndex) {
        numbers[i] = numbers[i] * numbers[i]
    }
    println(numbers.sum())
}
