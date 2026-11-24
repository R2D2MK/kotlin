package lists

/**
 * Пример работы со списками в Kotlin.
 * Цель: показать основные операции — создание, доступ, итерация, свойства.
 */

fun main() {
    // === Создание списков разных типов ===

    val numbers = listOf(15, 25, 100, -50, 0)           // Целые числа
    val decimalNumbers = listOf(58.69, 47.0, 85.6)      // Дробные числа
    val characters = listOf('r', 'i', '?')              // Символы
    val daysOfWeek = listOf(                            // Дни недели — индексация с 0
        "Monday",    // [0]
        "Tuesday",   // [1]
        "Wednesday", // [2]
        "Thursday",  // [3]
        "Friday",    // [4]
        "Saturday",  // [5]
        "Sunday"     // [6]
    )

    // === Вывод списков целиком ===

    println("Список целых чисел: $numbers")
    println("Список дней недели: $daysOfWeek")
    println()

    // === Доступ к элементам по индексу ===

    println("Первый день недели: ${daysOfWeek[0]}")     // Monday
    println("Второй элемент десятичных чисел: ${decimalNumbers[1]}") // 47.0
    println()

    // === Полезные методы списков ===

    println("Случайный день недели: ${daysOfWeek.random()}")
    println("Пуст ли список чисел? ${numbers.isEmpty()}") // false
    println("Количество элементов в списке чисел: ${numbers.size}") // 5
    println()

    // === Работа с индексами и диапазонами ===

    println("Диапазон 0..6: ${0..6}")                           // включительно
    println("Диапазон до последнего индекса: ${0..daysOfWeek.lastIndex}") // то же, что 0..6
    println("Индексы списка дней: ${daysOfWeek.indices}")       // удобный способ получить 0..6
    println("Диапазон 0 до size-1: ${0..daysOfWeek.size - 1}")  // ручной способ
    println("Диапазон 0 until size: ${0 until daysOfWeek.size}") // эксклюзивный конец — то же 0..6
    println("Список в обратном порядке: ${daysOfWeek.reversed()}")
    println()

    // === Итерация по списку: способ 1 — for-each (рекомендуемый) ===

    println("Перебор дней недели (for-each):")
    for (day in daysOfWeek) {
        println("День недели: $day")
    }
    println()

    // === Итерация по списку: способ 2 — по индексам (когда нужен индекс) ===

    println("Перебор дней недели по индексам:")
    for (index in daysOfWeek.indices) { // или: for (index in 0 until daysOfWeek.size)
        println("День недели ${index + 1}: ${daysOfWeek[index]}")
        //Выведет - День недели 1: Monday
    }
}