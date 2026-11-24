package arraysMultidimensional

fun main() {
    val menu = arrayOf(
        arrayOf("Маргарита", "Пепперони", "Гавайская", "Четыре сыра"),
        arrayOf("450 руб.", "550 руб.", "500 руб.", "600 руб."),
        arrayOf("400 г", "450 г", "420 г", "500 г")
    )

    // Внешний цикл: по каждой пицце (по столбцам)
    for (pizzaIndex in menu[0].indices) {
        // Внутренний цикл: по характеристикам (строкам)
        for (rowIndex in menu.indices) {
            print(menu[rowIndex][pizzaIndex])

            // Форматируем красиво:
            when (rowIndex) {
                0 -> print(" — ")  // после названия ставим тире
                1 -> print(", ")   // после цены — запятую
                2 -> {}            // после веса — ничего (конец строки)
            }
        }
        println() // переходим к следующей пицце
    }
}