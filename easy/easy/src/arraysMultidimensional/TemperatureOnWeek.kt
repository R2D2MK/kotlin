package arraysMultidimensional

fun main() {
    // 📊 Таблица: строки = время суток, столбцы = дни недели
    val temperatureOnWeek = arrayOf(
        arrayOf("Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"), // [0] — заголовки
        arrayOf(10.5, 10.7, 5.7, 7.8, 4.1, 12.4, 17.4),     // [1] — утро
        arrayOf(24.2, 25.2, 14.7, 24.8, 14.2, 24.2, 29.4),  // [2] — день
        arrayOf(31.2, 29.7, 20.1, 31.1, 19.7, 33.3, 35.3)   // [3] — вечер
    )

    // 🔍 Проходим по каждому дню (по столбцам!)
    for (dayIndex in temperatureOnWeek[0].indices) {
        // 📅 Получаем название дня
        val dayName = temperatureOnWeek[0][dayIndex]
        println("Температура на $dayName:")

        // 🌡️ Проходим по всем измерениям (строкам 1, 2, 3)
        for (dataIndex in 1 until temperatureOnWeek.size) {
            val temp = temperatureOnWeek[dataIndex][dayIndex]
            println("  $temp°C")
        }
        println() // пустая строка для красоты
    }
}