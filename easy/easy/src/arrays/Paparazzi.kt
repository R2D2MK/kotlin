package arrays

fun main() {
    val paparazziCount = 10
    val paparazziIds = Array<Int>(paparazziCount) { 0 } // Массив на 10 слотов, все заполнены 0

    while (true) {
        // Шаг 1: Выводим приглашение для ввода
        println("Введите ID папарацци (0 для выхода):")

        // Шаг 2: Читаем ID от пользователя
        val inputId = readln().toInt()

        // Шаг 3: Если ввели 0 — выходим из цикла
        if (inputId == 0) {
            break
        }

        // Шаг 4: Ищем первый свободный слот (где значение == 0) и записываем туда ID
        for (i in paparazziIds.indices) {
            if (paparazziIds[i] == 0) {
                paparazziIds[i] = inputId
                break // Записали — дальше не нужно искать
            }
        }
        // 💡 Дополнительно: можно добавить проверку "если массив полон" — но по условию не обязательно.
    }

    // Шаг 5: Выводим заголовок карты региона
    println()
    println("Карта региона:")

    // Шаг 6: Проверяем — есть ли хоть один папарацци?
    var foundPaparazzi = false

    for (id in paparazziIds) {
        if (id != 0) {
            println(" - Обнаружен папарацци с ID: $id")
            foundPaparazzi = true // Помечаем, что кто-то найден
        }
    }

    // Шаг 7: Если никого не нашли — выводим особое сообщение
    if (!foundPaparazzi) {
        println(" - Папарацци не обнаружено")
    }
}