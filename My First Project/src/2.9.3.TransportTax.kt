fun main() {
    // Шаг 1: Уточняем, является ли автомобиль грузовым
    // Пользователь вводит true (грузовик) или false (легковой)
    print("Is your car a truck? true/false: ")
    val truck = readln().toBoolean()

    // Шаг 2: Запрашиваем мощность двигателя в лошадиных силах (л.с.)
    print("Input engine power: ")
    val enginePower = readln().toInt() // преобразуем строку в целое число

    // Шаг 3: Определяем налоговую ставку (в рублях за 1 л.с.) в зависимости от типа ТС и мощности
    val rate: Int

    if (truck) {
        // Если это грузовик, применяем соответствующие ставки
        when {
            enginePower <= 100 -> rate = 25
            enginePower <= 150 -> rate = 40
            enginePower <= 200 -> rate = 50
            enginePower <= 250 -> rate = 65
            else -> rate = 85 // для мощности свыше 250 л.с.
        }
    } else {
        // Если это легковой автомобиль — другие ставки
        when {
            enginePower <= 100 -> rate = 10
            enginePower <= 150 -> rate = 34
            enginePower <= 200 -> rate = 49
            enginePower <= 250 -> rate = 75
            else -> rate = 150 // для мощности свыше 250 л.с.
        }
    }

    // Шаг 4: Рассчитываем итоговую сумму налога
    // Налог = мощность двигателя × ставка за лошадиную силу
    val tax = enginePower * rate

    // Шаг 5: Выводим информацию о типе транспортного средства
    if (truck) {
        println("Вид ТС: грузовой автомобиль")
    } else {
        println("Вид ТС: легковой автомобиль")
    }

    // Шаг 6: Выводим детали расчёта
    println("Мощность двигателя: $enginePower л.с.")
    println("Налоговая ставка: $rate руб./л.с.")
    println("Сумма налога: $tax руб.")
}