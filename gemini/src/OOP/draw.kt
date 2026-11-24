package OOP

open class Shape {
    open fun draw() {
        println("Рисуем фигуру")
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Рисуем круг")
    }
}
class Square : Shape() {
    override fun draw() {
        println("Рисуем квадрат")
    }
}

class Triangle: Shape() {
    override fun draw() {
        println("Рисуем треугольник")
    }
}

fun main() {
    val value = readln()

    // 1. Сначала выбираем и создаем нужный ОБЪЕКТ
    val shape: Shape = when(value) {
        "Circle" -> Circle()
        "Square" -> Square()
        "Triangle" -> Triangle()
        else -> Shape() // Создаем базовую фигуру, если ввод непонятен
    }

    // 2. А теперь работаем с ним, не зная, кто именно там внутри (Полиморфизм!)
    shape.draw()
}