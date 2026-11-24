package OOP

open class Person(val name: String) {
    open fun showInfo() {
        println("Имя: $name")
    }
}

class Moderator(name: String) : Person(name) {
    override fun showInfo() {
        super.showInfo() // Вызываем метод родителя для вывода имени
        println("Роль: Модератор") // Выводим специфичную роль
    }
}

class Admin(name: String) : Person(name) {
    override fun showInfo() {
        super.showInfo() // Вызываем метод родителя для вывода имени
        println("Роль: Администратор") // Исправлено на "Администратор"
    }

}

fun main() {
    val input = readln().split(" ")
    // Проверка на корректный ввод
    if (input.size > 3 || input.size < 2) {
        println("Ошибка: Введите имя и роль.")
        return
    }

    val name = input[0]
    val role = input[1]

    // Создаем экземпляр, передавая имя в конструктор
    val user: Person = when(role) {
        "Moderator" -> Moderator(name)
        "Admin" -> Admin(name)
        else -> Person(name)
    }

    // Теперь нам нужно вызвать только один метод, который выведет ВСЮ информацию
    user.showInfo()
}