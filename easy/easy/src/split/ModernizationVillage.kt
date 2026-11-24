package split

fun main() {
    // Списки для хранения данных по каждому посёлку
    val villageName = mutableListOf<String>()      // Названия посёлков
    val villageLevel = mutableListOf<Int>()        // Уровни развития (1-10)
    val villagePopulation = mutableListOf<String>() // Население (строкой, например "1500")
    var needModernization = false                  // Флаг: есть ли посёлки, требующие модернизации

    println("Введите количество поселков:")
    val villageCount = readln().toInt()            // Сколько посёлков будем вводить

    // Цикл ввода данных для каждого посёлка
    for (i in 1..villageCount) {
        val name = readln().split(": ")            // Формат ввода: "Название: Новоселье"
        villageName.add(name[1])                   // Берём часть после ": "

        val level = readln().split(": ")           // Формат: "Уровень: 3"
        val levelNumber = level[1].toInt()         // Преобразуем в число
        villageLevel.add(levelNumber)

        val population = readln().split(": ")      // Формат: "Население: 1200"
        villagePopulation.add(population[1])
    }

    println("Список поселков на модернизацию:")
    // Проверяем каждый посёлок: если уровень <= 5 — нуждается в модернизации
    for (index in villageLevel.indices) {
        val levelLive = villageLevel[index]
        if (levelLive <= 5) {
            needModernization = true
            println(" - ${villageName[index]} (Уровень: ${levelLive}, Жителей: ${villagePopulation[index]})")
        }
    }

    // Если ни один посёлок не требует модернизации — выводим сообщение
    if (!needModernization)
        println(" - Модернизация не требуется")
}