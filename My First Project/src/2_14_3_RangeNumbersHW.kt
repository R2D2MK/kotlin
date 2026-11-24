fun main() {
    val startRange = readln().toInt()
    val endRange = readln().toInt()

    val numberRange = (startRange .. endRange) step 8
    for (number in numberRange) {
        println(number)
    }
}