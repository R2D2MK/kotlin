package stringTheme

fun main() {
    val input = readln()
    val n = input.length

    for (i in 0 until n / 2) {
        if (input[i] != input[n - i - 1]) {
            println("NO")
            return
        }
    }
    println("YES")
}
