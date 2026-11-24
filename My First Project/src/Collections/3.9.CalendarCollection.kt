package Collections

fun main() {
    val daysOfMonths = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    print("input month number: ")
    val input = readln().toInt()
    if (input > 12 || input < 1) {
        print("Sorry! The month - incorrect.")
    } else {
        println(daysOfMonths[input - 1])
    }
}