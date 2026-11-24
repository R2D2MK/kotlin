package arrays

fun main() {
    val books = arrayOf("Книга 1", "Книга 2", "Книга 3")

    // Считываем номер книги
    val currentBookId = readln().toInt()

    // Проверяем, что индекс в допустимом диапазоне: от 0 до последнего индекса
    if (currentBookId in books.indices) {
        println("Текущая книга: ${books[currentBookId]}")
    } else {
        println("Ошибка: нет книги с номером $currentBookId")
        println("Допустимые номера: от ${books.indices.first} до ${books.indices.last}")
    }
}