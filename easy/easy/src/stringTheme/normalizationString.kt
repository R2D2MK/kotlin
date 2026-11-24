package stringTheme

fun main() {
    val input = readln()
    val words = input.split(" ")    // разбиваем предложение
    val nonEmptyWords = words.filter { it != "" }
    println(nonEmptyWords.joinToString(" "))
}