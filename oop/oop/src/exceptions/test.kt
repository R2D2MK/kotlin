package exceptions

fun main() {
    try {
        val a = readln().toInt()
        val b = readln().toInt()
        println(a / b)
    } catch (exception: ArithmeticException) {
        println("You can't divide by zero")
    } catch (exception: NumberFormatException) {
        println("Wrong input format")
    } catch (exception: Throwable) {
        println("Common error")
    }
    try {
        val array = arrayOf("A", "B", "C") // размер: 3
        val input = readln().toInt()
        println(array[input])
    } catch (exception: ArrayIndexOutOfBoundsException) {
        println("Ошибка: индекс не существует")
    }
//    if (b == 0) throw ArithmeticException("You can't divide by zero")
//
//    println("Trying to divide by zero")
//
    println("After try-catch")

//    throw ArithmeticException("You can't divide by zero")
//    println("After exception")
}