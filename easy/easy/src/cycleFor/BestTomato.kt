package cycleFor

fun main() {
    println("Введите количество сборщиков:")
    val collectorCount = readln().toInt()

    var maxCollectedValue = Int.MIN_VALUE
    var bestCollectorNumber = -1 // запоминаем номер лучшего сборщика

    for (collectorNumber in 1..collectorCount) {
        println("Введите урожай сборщика #$collectorNumber:")
        val personalCollectedValue = readln().toInt()

        // Если текущий урожай больше максимального — обновляем максимум и запоминаем номер
        if (personalCollectedValue > maxCollectedValue) {
            maxCollectedValue = personalCollectedValue
            bestCollectorNumber = collectorNumber
        }
    }

    // Выводим результат ПОСЛЕ цикла
    println("Самый эффективный сборщик: #$bestCollectorNumber | ${maxCollectedValue}т")
}