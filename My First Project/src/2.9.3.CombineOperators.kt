fun main() {
    // Запрашиваем у пользователя, хорошая ли погода, и преобразуем ввод в Boolean
    // Ожидается "true" или "false" (регистр не имеет значения, но опечатка даст false)
    print("The weather is good? true/false: ")
    val isGoodWeather = readln().toBoolean()

    // Запрашиваем текущее время в часах (целое число от 0 до 23)
    print("what time is it? ")
    val time = readln().toInt() // Важно: если ввести не число — программа завершится с ошибкой

    // Определяем, является ли текущее время днём (от 6 до 21 включительно)
    val isDay = time in 6..<22  // 6 <= time <= 21

    // Определяем, является ли текущее время ночью (22:00–5:59)
    val isNight = time >= 22 || time <= 5  // включает 22, 23, 0, 1, ..., 5

    // Логика принятия решения:
    if (!isNight && isGoodWeather) {
        // Если сейчас НЕ ночь И погода хорошая — идём гулять
        println("Go for a walk")
    } else if (!isNight && !isGoodWeather) {
        // Если сейчас день, но погода плохая — читаем книгу
        println("Go read the book")
    } else {
        // Во всех остальных случаях (в основном — если ночь) — спим
        println("Go to sleep")
    }
}