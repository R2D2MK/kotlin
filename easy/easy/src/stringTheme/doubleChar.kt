package stringTheme

fun main() {
    // Считываем строку с клавиатуры
    val inputText = readln()

    // Перебираем каждый символ во входной строке
    for (candidateChar in inputText) {
        // Счётчик количества вхождений текущего символа
        var occurrences = 0

        // Считаем, сколько раз candidateChar встречается во всей строке
        for (charInText in inputText) {
            if (charInText == candidateChar) {
                occurrences++
            }
        }

        // Если символ встречается ровно два раза — это и есть искомая буква
        if (occurrences == 2) {
            println(candidateChar)
            return  // Прекращаем программу, так как ответ найден
        }
    }
}
