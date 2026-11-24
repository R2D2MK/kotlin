package oop

// 📐 Класс Triangle: принимает 3 стороны как неизменяемые свойства (val).
class Triangle (
    val side1: Double,
    val side2: Double,
    val side3: Double
) {
    // 💡 Метод-выражение: возвращает String, проверяя условие равностороннего треугольника.
    fun isEquilateral(): String {
        return if (side1 == side2 && side2 == side3) {
            "Equilateral"
        } else {
            "Not Equilateral"
        }
    }
}

fun main() {
    // 1. Читаем n: количество треугольников для обработки.
    val inputTriangle = readln().toInt()

    // 2. Цикл 'repeat': повторяет блок кода n раз.
    repeat(inputTriangle){
        // 3. Чтение и деструктуризация:
        // Читаем строку, разбиваем по пробелу, преобразуем в Double и распаковываем в side1, side2, side3.
        val (side1, side2, side3) = readln().split(" ").map {it.toDouble()}

        // 4. Создание экземпляра класса.
        val myTriangle = Triangle(side1, side2, side3)

        // 5. Вызов метода и вывод результата.
        println(myTriangle.isEquilateral())
    }
}