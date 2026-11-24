package cycleFor

fun main() {
    // Считываем количество блюд
    val sumDish = readln().toInt()

    // Переменная для хранения общей суммы калорий
    var totalCalories = 0

    // Цикл for: i от 1 до sumDish (выполняется ровно sumDish раз)
    for (i in 0 until sumDish) {
        // Считываем название блюда
        val dishName = readln()

        // Проверяем, какое это блюдо, и добавляем соответствующие калории
        if (dishName == "Грибной суп") {
            totalCalories += 50900
        } else if (dishName == "Крем-суп из тыквы") {
            totalCalories += 92500
        } else if (dishName == "Винегрет") {
            totalCalories += 130100
        }
        // Если блюдо неизвестно — ничего не добавляем (по условию все блюда корректные)
    }

    // Выводим результат
    println("Количество калорий в блюдах: $totalCalories")
}