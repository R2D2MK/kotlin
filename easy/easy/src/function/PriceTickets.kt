package function

fun main() {
    println("Выберите тип билета (1-3):")
    val ticketType = readln().toInt() // Считываем тип билета от пользователя

    println("Выберите количество билетов:")
    val ticketCount = readln().toInt() // Считываем количество билетов

    // Вызываем функцию, передав ей тип и количество билетов
    bookTicket(ticketType, ticketCount)
}

// Функция теперь принимает тип билета и его количество
fun bookTicket(ticketType: Int, ticketCount: Int) {
    // Внутри функции мы будем хранить цену одного билета (уже со скидкой!)
    val pricePerTicket  = when(ticketType) {
        1 -> 2000 // Цена за один билет первого типа
        2 -> 1000 // Цена за один билет второго типа
        3 -> 500   // Цена за один билет третьего типа

        else -> {
            println("Неверный тип билета.")
            return // Если тип неверный, выходим из функции
        }
    }

    // Рассчитываем общую стоимость, просто умножив цену одного билета на количество
    val totalPrice = pricePerTicket * ticketCount

    // Выводим результат
    println("Стоимость билетов - $totalPrice кредитов")
}
