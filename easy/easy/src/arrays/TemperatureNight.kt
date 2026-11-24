package arrays

fun main() {
    // Температуры ночью на планете
    val nightTemperatureList = arrayOf(-10, -55, -25, -30, -50, -55, -60, -5)

    // Перебираем по индексам (0, 1, 2, ..., 7)
    for (index in nightTemperatureList.indices) {
        // Сравниваем температуру, а не index
        // index — это номер
        //array[index] — это данные
        if (nightTemperatureList[index] < -30) {
            println("День ${index + 1}. Оставайтесь на базе")
        }
    }
}