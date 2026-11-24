fun main() {
    // Запрашиваем тип транспортного средства (true - грузовой, false - легковой)
    print("Is your car a truck? true/false: ")
    val truck = readln().toBoolean()  // Преобразуем ввод в логическое значение

    // Запрашиваем мощность двигателя в лошадиных силах
    print("Input engine power: ")
    val enginePower = readln().toInt()  // Преобразуем ввод в целое число

    // Инициализируем переменную для налоговой ставки
    var rate = 0

    // Определяем налоговую ставку в зависимости от типа ТС и мощности
    if (truck) {
        // Налоговые ставки для ГРУЗОВЫХ автомобилей
        if (enginePower <= 100) rate = 25        // до 100 л.с.
        else if (enginePower <= 150) rate = 40   // 101-150 л.с.
        else if (enginePower <= 200) rate = 50   // 151-200 л.с.
        else if (enginePower <= 250) rate = 65   // 201-250 л.с.
        else rate = 85                           // свыше 250 л.с.
    } else {
        // Налоговые ставки для ЛЕГКОВЫХ автомобилей
        if (enginePower <= 100) rate = 10        // до 100 л.с.
        else if (enginePower <= 150) rate = 34   // 101-150 л.с.
        else if (enginePower <= 200) rate = 49   // 151-200 л.с.
        else if (enginePower <= 250) rate = 75   // 201-250 л.с.
        else rate = 150                          // свыше 250 л.с.
    }

    // Вычисляем сумму налога: мощность × ставка
    val tax = enginePower * rate

    // Определяем текстовое представление типа автомобиля
    val carType = if (truck) "грузовой" else "легковой"

    // Выводим детальную информацию о расчете налога
    println("Вид ТС: $carType автомобиль")
    println("Мощность двигателя: $enginePower л.с.")
    println("Налоговая ставка: $rate руб./л.с.")
    println("Сумма налога: $tax руб.")
}