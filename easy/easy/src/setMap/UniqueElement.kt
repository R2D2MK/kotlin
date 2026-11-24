package setMap

fun main() {
    // 1. Считываем строку из консоли
    val input = readLine() ?: return  // если ввода нет — завершаем (защита от null)

    // 2. Разбиваем строку по запятой и убираем пробелы вокруг каждого элемента
    val items = input
        .split(",")               // разделяем по запятой → список строк
        .map { it.trim() }        // убираем пробелы в начале и конце у каждой части

    // 3. Создаём пустую изменяемую карту для подсчёта
    val counts = mutableMapOf<String, Int>()

    // 4. Проходим по каждому элементу и обновляем счётчик
    for (item in items) {
        // getOrDefault — возвращает текущее значение или 0, если ключа ещё нет
        val currentCount = counts.getOrDefault(item, 0)
        counts[item] = currentCount + 1
    }

    // 5. Выводим результат
    println(counts)
}

