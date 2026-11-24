package Collections

fun main() {
    val months = listOf("Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь")
    print("input month number: ")
    val outputResult = readln().toInt()
    if (outputResult > 12 || outputResult < 1) {
        print("Некорректное значение: $outputResult")
    }
    else {
    println(months[outputResult - 1])
    }
}