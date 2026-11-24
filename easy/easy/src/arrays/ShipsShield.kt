package arrays

fun main() {
    // Шаблон расположения генераторов
    val template = arrayOf(
        arrayOf(0, 1, 1, 1, 0),
        arrayOf(1, 1, 1, 1, 1),
        arrayOf(1, 1, 1, 1, 1),
        arrayOf(1, 1, 1, 1, 1),
        arrayOf(0, 1, 1, 1, 0)
    )

    // Данные о состоянии генераторов для каждого корабля
    val shipsGenerators = arrayOf(
        // Корабль 1
        arrayOf(
            arrayOf(0, 1, 1, 1, 0),
            arrayOf(1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1),
            arrayOf(0, 1, 1, 1, 0)
        ),
        // Корабль 2
        arrayOf(
            arrayOf(0, 0, 1, 1, 0),
            arrayOf(1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1),
            arrayOf(1, 1, 1, 1, 1),
            arrayOf(0, 1, 1, 0, 0)
        )
    )

    println("Введите номер корабля:")
    val inputShipNumber = readln()
    val shipNumber = inputShipNumber.toInt()
    val shipIndex = shipNumber - 1

    // Получаем состояние генераторов для выбранного корабля
    val shipGeneratorMap = shipsGenerators[shipIndex]

    // Проверяем работоспособность генераторов
    var hasErrors = false
    print("Статус: ")
    for (i in shipGeneratorMap.indices) {
        for (j in shipGeneratorMap[i].indices) {
            // Если в шаблоне должен быть генератор, но он не работает
            if (template[i][j] == 1 && shipGeneratorMap[i][j] == 0) {
                if (!hasErrors) {
                    println("обнаружены ошибки в генераторах")
                    println("Координаты нерабочих генераторов:")
                    hasErrors = true
                }
                println(" - x:${j + 1}, y:${i + 1}")
            }
        }
    }

    // Если ошибок не найдено
    if (!hasErrors) {
        print("генераторы работают корректно")
    }
}