package arrays

/**
 * Учебный пример: демонстрация работы с массивами (Array) и списками (List) в Kotlin.
 *
 * Сравниваем:
 * - Array: изменяемое по содержимому, фиксированного размера
 * - List: неизменяемый, но можно создавать новые
 *
 * Показаны ключевые операции: доступ, изменение, вывод, проверка, расширение.
 */
fun main() {
    // === 1. Создание: List (неизменяемый) vs Array (изменяемый) ===

    // Список (List) — неизменяемый: нельзя менять элементы после создания
    val numbersList = listOf(1, 2, 3, 4, 5)

    // Массив (Array) — можно менять элементы, но размер фиксирован (пока)
    var numbersArray = arrayOf(1, 2, 3, 4, 5)

    // === 2. Доступ к элементам по индексу ===

    println("Первый элемент списка (index 1): ${numbersList[1]}") // Вывод: 2

    // === 3. Изменение элемента в массиве ===

    numbersArray[1] = 7 // Меняем второй элемент (индекс 1)
    println("После изменения: ${numbersArray[1]}") // Вывод: 7

    // === 4. Вывод массива в виде строки ===

    println("Массив после изменения: ${numbersArray.joinToString()}")

    // === 5. Сравнение вывода List и Array ===

    println("Список (listOf): $numbersList") // Вывод: [1, 2, 3, 4, 5]
    println("Массив (arrayOf): ${numbersArray.joinToString()}") // Вывод: 1, 7, 3, 4, 5

    // === 6. Перебор массива через цикл for ===

    print("Элементы массива: ")
    for (number in numbersArray) {
        print("$number ")
    }
    println() // Переход на новую строку

    // === 7. Создание списка из диапазона ===

    val numberListSecond = (1..10).toList() // Диапазон 1–10 → список
    println("Список из диапазона 1..10: $numberListSecond")

    // === 8. Полезные свойства массива ===

    println("Размер массива: ${numbersArray.size}")           // 5
    println("Последний индекс: ${numbersArray.lastIndex}")    // 4 (size - 1)
    println("Диапазон индексов: ${numbersArray.indices}")     // 0..4
    println("Массив пустой? ${numbersArray.isEmpty()}")       // false
    println("Содержит 20? ${numbersArray.contains(20)}")      // false

    // Меняем элемент и проверяем снова
    numbersArray[1] = 20
    println("Теперь содержит 20? ${numbersArray.contains(20)}") // true

    // === 9. Важно: массивы в Kotlin — фиксированного размера ===
    //
    // Операция `+` для Array не изменяет сам массив,
    // а возвращает **новый массив** (расширенную копию).
    // Поэтому нужно переприсвоить.

    numbersArray = numbersArray + 6 // Добавляем элемент 6 в конец
    println("Массив после добавления 6: ${numbersArray.joinToString()}") // 1, 20, 3, 4, 5, 6
}