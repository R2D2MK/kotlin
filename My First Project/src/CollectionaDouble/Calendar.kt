package CollectionaDouble

fun main() {
    val daysOfMonth = listOf<Int>(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    print("Enter index of month: ")
    val index = readln().toInt()
    if (index > daysOfMonth.size || index < 1) {
        print("Incorrect index of month")
    }
    else {
        val result = daysOfMonth[index - 1]
        println(result)
    }
}