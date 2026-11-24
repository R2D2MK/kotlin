package privacy
import kotlin.io.readLine as readlnOrNull // Для использования readlnOrNull в старых версиях Kotlin

open class Person {
    // Поле 'name' доступно только внутри Person.
    private var name: String = ""

    fun setName(newName: String) {
        this.name = newName
    }

    // Protected геттер: позволяет наследнику получить доступ к private полю.
    protected fun getNameValue(): String {
        return name
    }
}

class Student : Person() {
    // 1. ИСПРАВЛЕНИЕ: Делаем поле private, чтобы компилятор не генерировал конфликтующий сеттер.
    private var studentId: Int = 0

    // 2. Наш собственный публичный сеттер
    fun setStudentId(newId: Int) {
        this.studentId = newId
    }

    fun printStudentDetails() {
        // Вызов protected метода разрешен
        val name = getNameValue()

        // Доступ к private полю studentId разрешен, т.к. мы внутри класса Student.
        println("Name: $name, Student ID: $studentId")
    }
}

fun main() {
    // Безопасно считываем количество студентов
    val n = readlnOrNull()?.toIntOrNull() ?: return // Завершаем, если ввод некорректен

    for (i in 1..n) {
        val inputLine = readlnOrNull() // Безопасное считывание строки

        if (inputLine.isNullOrBlank()) {
            println("Ввод пуст, пропуск.")
            continue
        }

        val parts = inputLine.split(" ")

        // Проверяем, что есть хотя бы две части (Имя и ID)
        if (parts.size < 2) {
            println("Некорректный формат ввода (нет имени или ID), пропуск.")
            continue
        }

        val nameInput = parts[0]
        // Безопасно преобразуем ID в Int, иначе пропускаем
        val idInput = parts[1].toIntOrNull()

        if (idInput == null) {
            println("ID должен быть числом, пропуск.")
            continue
        }

        // 4. Создаем экземпляр Student
        val student = Student()

        // 5. Устанавливаем имя (через Person.setName)
        student.setName(nameInput)

        // 6. Устанавливаем ID (через Student.setStudentId)
        student.setStudentId(idInput)

        // 7. Выводим результат
        student.printStudentDetails()
    }
}