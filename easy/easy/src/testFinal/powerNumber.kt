package testFinal

fun main() {
    val a = readln().toInt()
    val n = readln().toInt()

    var result = 1
    repeat(n) {
        result *= a
    }
    println(result)
}