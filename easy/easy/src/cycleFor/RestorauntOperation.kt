package cycleFor

/**
 * Программа для расчёта общего количества операций
 * в выбранном ресторане за указанное количество часов.
 * Данные: операции каждые 2 часа, начиная с 08:00.
 * Пример ввода: "Голубая звезда", 10 → вывод: "Голубая звезда: 51000"
 */
fun main() {
    // Данные: количество операций за каждый 2-часовой интервал (с 08:00 до 18:00)
    val operationsBlueStar = listOf(10000, 23000, 7000, 1000, 10000)         // Голубая звезда
    val operationsEnergy = listOf(15000, 10000, 5000, 1000, 15000)           // Энерго
    val operationsSeaDelicacies = listOf(7000, 6000, 2000, 1000, 7000)       // Морские вкусности

    // Считываем входные данные
    val restaurantName = readln()      // Название ресторана
    val hours = readln().toInt()       // Общее время с 08:00 в часах

    // Каждый интервал длится 2 часа → количество интервалов
    val interval = hours / 2

    // Переменная для хранения итогового количества операций
    var totalOperations = 0

    // Определяем, из какого ресторана брать данные
    when (restaurantName) {
        "Голубая звезда" -> totalOperations = operationsBlueStar.take(interval).sum()
        "Энерго" -> totalOperations = operationsEnergy.take(interval).sum()
        "Морские вкусности" -> totalOperations = operationsSeaDelicacies.take(interval).sum()
        else -> {
            // Если введено неизвестное название
            println("Ошибка: неизвестное название ресторана — $restaurantName")
            return // завершаем программу
        }
    }

    // Выводим результат
    println("$restaurantName: $totalOperations")
}