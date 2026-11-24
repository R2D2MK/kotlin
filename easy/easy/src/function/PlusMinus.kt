package function

fun main() {
    val number = readln().toInt()
    val result1 = number + 1
    val result2 = result1 - 2

    val view = printNumbers(result1, result2)

}
fun printNumbers(result1: Int, result2: Int) {

        println(result1)
        println(result2)
    }
