package arraysMultidimensional

fun main() {
    println("Сколько машин участвует?")
    val carCount = readln().toInt()

    // 🏁 Таблица: каждая строка = [марка, водитель, скорость]
    val carDataList = Array(carCount) { Array(3) { "" } }

    // 📥 Вводим данные
    for (i in 0 until carCount) {
        println("Введите данные машины $i (формат: марка;водитель;скорость):")
        val line = readln()
        val parts = line.split(";")
        carDataList[i][0] = parts[0] // марка
        carDataList[i][1] = parts[1] // водитель
        carDataList[i][2] = parts[2] // скорость (строка)
    }

    // 🔄 Сортируем по скорости (по возрастанию)
    for (i in carDataList.indices) {
        for (j in carDataList.indices) {
            val speedI = carDataList[i][2].toDouble()
            val speedJ = carDataList[j][2].toDouble()
            if (speedI < speedJ) {
                // Меняем местами ВСЮ строку — проще и надёжнее!
                val temp = carDataList[i]
                carDataList[i] = carDataList[j]
                carDataList[j] = temp
            }
        }
    }

    // 🏆 Выводим результат
    println("\n🏁 Результаты круга (по возрастанию скорости):")
    for (car in carDataList) {
        println("Машина \"${car[0]}\", ${car[2]} км/ч (водитель: ${car[1]})")
    }
}