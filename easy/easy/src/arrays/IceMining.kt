package arrays

fun main() {
    // Начальные объёмы льда в трёх ледниках
    val glaciers = arrayOf(100.0, 250.0, 35.0)

    // Сколько дней будет идти добыча
    val days = readln().toInt()

    // Цикл по каждому дню добычи
    for (day in 1..days) {
        // Читаем номер ледника (1, 2 или 3)
        val glacierNumber = readln().toInt()
        // Читаем объём добытого льда
        val minedIce = readln().toDouble()

        // Переводим номер ледника в индекс массива (1 → 0, 2 → 1, 3 → 2)
        val index = glacierNumber - 1

        // Обновляем объём льда в этом леднике — вычитаем добытое
        glaciers[index] -= minedIce
    }

    // После всех дней — выводим финальную статистику
    println("Статистика по ледникам:")
    for (volume in glaciers) {
        println(" - Текущий объем льда: $volume")
    }
}