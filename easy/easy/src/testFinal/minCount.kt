package testFinal

fun main() {
    val n = readln().toInt()
    var min = 1000001
    var countMin = 0

    for (i in 0 until n) {
        val number = readln().toInt()
        if (number < min) {
            min = number
            countMin = 1
        }
        else if (number == min) {
            countMin++
        }
        }
    println(countMin)
    }
