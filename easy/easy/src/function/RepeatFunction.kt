package function

fun main() {
    val message = readln()
    val times = readln().toInt()

    printNTimes(message, times)
}

/**
 * Печатает заданную строку [message] ровно [times] раз, каждый раз с новой строки.
 */
fun printNTimes(message: String, times: Int) {
    repeat(times) {
        println(message)
    }
}
