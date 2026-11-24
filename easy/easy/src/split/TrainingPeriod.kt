package split

fun main() {
    val input = readln()

    // Разбиваем строку по запятым
    val parts = input.split(",")

    // Создаём список для хранения чисел (0 и 1)
    val days = mutableListOf<Int>()

    // Вручную преобразуем каждую часть в число
    for (part in parts) {
        val number = part.trim().toInt()  // убираем пробелы, конвертируем в число
        days.add(number)
    }

    var currentStreak = 0   // текущая цепочка посещений
    var maxStreak = 0       // максимальная цепочка

    // Проходим по всем дням
    for (day in days) {
        if (day == 1) {
            currentStreak++     // продолжаем цепочку
        } else {
            // если встретили 0 — цепочка прервалась
            if (currentStreak > maxStreak) {
                maxStreak = currentStreak
            }
            currentStreak = 0   // сбрасываем счётчик
        }
    }

    // Проверяем последнюю цепочку (вдруг она самая длинная)
    if (currentStreak > maxStreak) {
        maxStreak = currentStreak
    }

    println("Самый длинный период посещений: $maxStreak дней")
}