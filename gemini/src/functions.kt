// ОПРЕДЕЛЕНИЕ (Инструкция для сотрудника)
fun sayHello(name: String) {
    println("Привет $name! Я новая функция.")
}
fun addNumbers(a: Double, b: Double): Double {
    val sum = a + b
    return sum // ВОЗВРАТ результата в точку вызова
}
fun main() {
    // ВЫЗОВ (Директор дает команду)
    sayHello("Maxim")
    val result = addNumbers(10.5, 5.5)
    println("Сумма: $result") // Вывод: 16.0
}