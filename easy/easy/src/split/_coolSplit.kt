package split

fun main() {
    val (a, b, c, d, e,) = readln().split(' ')
    val maxValue = maxOf(a, b, c, d)
    val minValue = minOf(a, b, c, d)
    if (e == "true") {
        print(minValue)
    } else print(maxValue)
}