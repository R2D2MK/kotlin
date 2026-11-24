fun main() {
    // Чтение данных пользователя с консоли
    val name = readln()          // Имя человека
    val birth = readln()         // Дата рождения
    val placeBirth = readln()    // Место рождения
    val father = readln()        // Имя отца
    val mother = readln()        // Имя матери
    val brother = readln()       // Имя брата
    val wife = readln()          // Имя жены

    // Вывод анкеты в формате "поле: значение"
    // \n - символ переноса строки для красивого форматирования
    println("Имя: $name\nДата рождения: $birth\nМесто рождения: $placeBirth\nОтец: $father\nМать: $mother\nБрат: $brother\nЖена: $wife")
}