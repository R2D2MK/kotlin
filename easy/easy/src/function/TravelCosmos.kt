package function

val userPaths = arrayOf(
    arrayOf("Точка #136", "Точка #269", "Точка #962"),
    arrayOf("Точка #136", "Точка #369", "Точка #962")
)
val pathHints = arrayOf(
    arrayOf(
        "Синий проводник в воде поник", "В том краю темным-темно, светится одно окно",
        "Ярко-красная панама всё парит, как та реклама"
    ),
    arrayOf(
        "Синий проводник в воде поник", "Быстрые спорткары всё жужжат вверху, но они не видят эту красоту",
        "Ярко-красная панама всё парит, как та реклама"
    )
)
var currentPath = -1
var currentPoint = -1
var currentHint = -1

fun showPath() {
    if (currentPath == -1) {
        // ПЕРВЫЙ РАЗ - спрашиваем маршрут
        val input = readln()
        if (input == "Маршрут: 1") {
            currentPath = 0
            currentPoint = 0
        } else if (input == "Маршрут: 2") {
            currentPath = 1
            currentPoint = 0
        }
    }
    if (currentPoint == 0) {
        // Первый вызов
        println("Маршрут: Текущее местоположение -> ${userPaths[currentPath][currentPoint]}")
    } else {
        // Второй+ вызов (currentPoint уже > 0)
        println("Маршрут: ${userPaths[currentPath][currentPoint - 1]} -> ${userPaths[currentPath][currentPoint]}")
    }
}

fun getHint() {
    println("Подсказка: ${pathHints[currentPath][currentPoint]}")
}

fun checkPoint() {
    println("Текущая точка: ${userPaths[currentPath][currentPoint]}")
    currentPoint ++
}

fun completeJourney() {
    println("Поздравляем с завершением путешествия по маршруту #${currentPath+1}!")
}

fun main() {
    do {
        val inputCommand = readln()

        when (inputCommand) {
            "Отобразить маршрут" -> {
                showPath()
            }

            "Взять подсказку" -> {
                getHint()
            }

            "Отметиться на точке" -> {
                checkPoint()
            }

            "Закончить путешествие" -> {
                completeJourney()
            }
        }
    } while (inputCommand != "Выключить КПК")
}
