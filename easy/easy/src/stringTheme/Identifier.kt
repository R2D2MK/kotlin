package stringTheme

fun main() {
    val input = readln()

    // Защита от пустой строки — критически важна!
    if (input.isEmpty()) {
        println("NO")
        return
    }

    val firstSymbol = input[0]

    val firstCharValid: Boolean = firstSymbol == '_' ||
            firstSymbol in 'A'..'Z' ||
            firstSymbol in 'a'..'z'

    if (firstCharValid == false) {
        println("NO")
        return
    }

    var allCharsValid = true
    for (i in input.indices) {
        val c = input[i]
        if (c != '_' && c !in '0'..'9' && c !in 'A'..'Z' && c !in 'a'..'z') {
            allCharsValid = false
            break  // нет смысла проверять дальше
        }
    }

    // вывод результата после проверки всех символов
    if (allCharsValid) {
        println("YES")
    } else {
        println("NO")
    }
}