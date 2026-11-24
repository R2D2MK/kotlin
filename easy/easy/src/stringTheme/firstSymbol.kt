package stringTheme

fun main() {
    val input = readln()

    for (i in input.indices) {
        if (input[i] == 'x' || input[i] == 'w') {
            println(input[i])
            return
        }
    }
    println(-1)

}