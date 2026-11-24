package function

// Создаём более удобный класс для хранения данных
data class Location(
    val name: String,
    val time: Int,
    val cost: Int
)

// Используем класс для создания массива точек интереса
val interestPoints = arrayOf(
    Location("Отель", 15, 20),
    Location("Пляж", 15, 50),
    Location("Водные горки", 15, 30),
    Location("Подводная экскурсия", 60, 300),
)

fun main() {
    println("Время на маршрут (в минутах):")
    val time = readln().toInt()

    println("Максимальная стоимость тура (в кредитах):")
    val maxCost = readln().toInt()

    println("Максимальное количество локаций (в единицах):")
    val maxLocationCount = readln().toInt()

    // Вызываем функцию с нужными аргументами
    val foundRoute = findRoute(time, maxCost, maxLocationCount)

    println("Маршрут:")
    if(foundRoute.isNotEmpty()) { // Используем isNotEmpty для правильной проверки
        for(point in foundRoute) {
            println(" - $point")
        }
    } else {
        println(" - Не найден")
    }
}


fun findRoute(maxTime: Int, maxCost: Int, maxLocationCount: Int): Array<String> {
    val route = mutableListOf<String>() // Используем список, который удобно заполнять

    var currentTime = 0
    var currentCost = 0

    for (point in interestPoints) {
        // Проверяем, не превысили ли мы лимиты
        if (route.size >= maxLocationCount) {
            break // Если локаций уже достаточно, выходим
        }

        if (currentTime + point.time <= maxTime && currentCost + point.cost <= maxCost) {
            route.add(point.name)
            currentTime += point.time
            currentCost += point.cost
        }
    }

    return route.toTypedArray() // Преобразуем список в массив для возврата
}
