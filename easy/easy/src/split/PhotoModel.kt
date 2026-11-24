package split

fun main() {
    // Запрашиваем общее количество фотографов
    println("Введите количество фотографов на странице:")
    val photographerCount = readln().toInt()
    // Создаём списки для хранения данных
    val nicknames = mutableListOf<String>()   // ники
    val statuses = mutableListOf<String>()    // статусы
    val ratings = mutableListOf<Int>()        // рейтинги
    // Вводим ники фотографов
    println("Введите ники фотографов:")
    for (i in 1..photographerCount) {
        val nickName = readln()
        nicknames.add(nickName)
    }
    // Вводим статусы фотографов
    println("Введите статусы фотографов:")
    for (i in 1..photographerCount) {
        val status = readln()
        statuses.add(status)
    }
    // Вводим рейтинги фотографов (целые числа)
    println("Введите рейтинг фотографов:")
    for (i in 1..photographerCount) {
        val rating = readln().toInt()
        ratings.add(rating)
    }
    // Выводим заголовок перед списком свободных фотографов
    println("Список открытых к сотрудничеству фотографов:")
    // Проходим по всем статусам и выводим только "Свободен"/"Свободна"
    for (j in statuses.indices) {
        if (statuses[j] == "Свободен" || statuses[j] == "Свободна") {
            var stars = ""              // строка для звёздочек
            val rating = ratings[j]     // текущий рейтинг
            // Добавляем заполненные звёзды ★ по количеству рейтинга
            for (i in 1..rating) stars += "★"
            // Добавляем пустые звёзды ☆ до 5 штук
            for (i in 1..(5 - rating)) stars += "☆"
            // Выводим результат в нужном формате
            println(" - ${nicknames[j]} | Рейтинг: $stars ($rating/5)")
        }
    }
}