package lists.map

fun main() {
    val n = readln().toInt()
    val words = mutableListOf<String>()

    // Читаем строки, пока не соберём ровно N слов
    while (words.size < n) {
        val line = readln()
        // split("\\s+") делит по любому количеству пробельных символов
        words.addAll(line.split("\\s+".toRegex()).filter { it.isNotEmpty() })
    }

    // Берём только первые N слов (на случай, если в последней строке было лишнее)
    val result = words
        .take(n)
        .reversed()              // переворачиваем порядок слов
        .map { it.reversed() }   // переворачиваем буквы в каждом слове
        .joinToString(" ")       // собираем в строку

    println(result)
}