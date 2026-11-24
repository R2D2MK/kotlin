fun main() {
    // Считываем тариф — цена за 1 кв.м
    val tariffPrice = readln().toInt()

    var clientNumber = 0  // Счётчик клиентов

    println("Список клиентов:")  // Выводим заголовок один раз

    while (true){
        val input = readln() // Читаем площадь или команду
        // Проверяем, не закончились ли клиенты
        if (input == "Клиенты ушли" || input == "") {
            break // Выходим из цикла
        }
        // Преобразуем ввод в число (площадь дома)
        val houseArea = input.toInt()
        val price = tariffPrice * houseArea // Считаем стоимость по формуле

        clientNumber ++ // Увеличиваем номер клиента на 1

        // Выводим информацию о клиенте и стоимости охлаждения
        println(" - Клиент $clientNumber. Стоимость: $price кредитов")
    }

}