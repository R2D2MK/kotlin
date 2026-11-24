package _2_BasicSyntax

fun main() {
    // Список имён, в котором будем искать
    val names = listOf("John", "Mike", "Nick", "Helen", "Alex", "Emma", "Mark")

    // Запрашиваем имя у пользователя
    print("Enter name: ")
    val searchName = readln()

    // Флаг: найдено ли имя (пока нет)
    var nameFound = false

    // Перебираем каждое имя в списке
    for (name in names) {
        println(name) // Выводим имя — как будто "просматриваем" список

        // Если введённое имя совпадает с текущим — отмечаем, что нашли
        if (searchName == name) {
            nameFound = true
            break // Прерываем цикл — дальше искать не нужно
        }
    }

    // Выводим результат: true — найдено, false — не найдено
    println("Name found: $nameFound")
}

/**
    Примечание: ранее использовался цикл while — он работает так же,
    но for здесь проще и читабельнее.
    var index = 0
    while (index < names.size) {
    println(names[index])
    if (searchName == names[index]) {
        nameFound = true
        break
    }
    index++
}
**/