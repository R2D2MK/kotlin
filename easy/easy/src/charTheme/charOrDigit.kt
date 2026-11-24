package charTheme

fun main() {
    val symbol: Char = readln().single()
    val digital: Int = symbol.code

    if (digital >= 48 && digital <= 57) {
        println("YES")
    } else println("NO")
}