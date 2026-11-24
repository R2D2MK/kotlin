package cycleFor

fun main() {
    // Шаг 1: Спрашиваем, сколько списков друзей нужно обработать
    println("Введите количество списков друзей:")
    val listCount = readln().toInt() // например, 2, 3 и т.д.

    // Шаг 2: Считываем первый список — он будет "эталоном" для сравнения
    println("Введите список #1 из 5 друзей:")
    val firstFriends = mutableListOf<String>() // создаём изменяемый список
    repeat(5) { // 5 раз — по одному имени за раз
        firstFriends.add(readln()) // добавляем имя в список
    }

    // Шаг 3: Для каждого следующего списка (со 2-го по последний)
    for (listNumber in 2..listCount) {
        println("Введите список #$listNumber из 5 друзей:")
        val currentFriends = mutableListOf<String>() // текущий список
        repeat(5) {
            currentFriends.add(readln())
        }

        // Шаг 4: Ищем общих друзей между первым списком и текущим
        for (friend in currentFriends) { // для каждого друга в текущем списке
            if (friend in firstFriends) { // если этот друг есть в первом списке
                println("Общий друг в списках 1 и $listNumber: $friend")
            }
        }
    }
}