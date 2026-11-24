// Родительский класс на верхнем уровне
open class Vehicle {
    open fun drive() {
        println("Едем на транспортном средстве")
    }
}

// Независимый подкласс
class Car : Vehicle() {
    override fun drive() {
        println("Едем на машине")
    }
}
// Независимый подкласс
class Boat : Vehicle() {
    override fun drive() {
        println("Плывем на лодке")
    }
}

// Независимый подкласс
class Bicycle : Vehicle() {
    override fun drive() {
        println("Едем на велосипеде")
    }
}

fun main() {
    val vehicle = readln()

    // 1. Создание объекта (Polymorphism)
    // Мы объявляем переменную типа Vehicle, но создаем конкретный подкласс
    val transport: Vehicle = when(vehicle) {
        "Car" -> Car()
        "Bicycle" -> Bicycle()
        "Boat" -> Boat()
        else -> Vehicle()
    }

    // 2. Вызов метода
    transport.drive()
}