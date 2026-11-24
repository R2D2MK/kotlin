// Решение номер 2 - размен долларов на купюры разного номинала
fun main() {
    // Читаем общую сумму долларов для размена
    val inputDollar = readln().toInt()

    // Размен на купюры по 100 долларов
    val hundred = (inputDollar / 100)          // Количество стодолларовых купюр
    val remainingAfterHundred = inputDollar % 100 // Остаток после выдачи 100$ купюр

    // Размен остатка на купюры по 50 долларов
    val fifty = remainingAfterHundred / 50     // Количество пятидесятидолларовых купюр
    val remainingAfterFifty = remainingAfterHundred % 50 // Остаток после 50$ купюр

    // Размен остатка на купюры по 20 долларов
    val twenty = remainingAfterFifty / 20      // Количество двадцатидолларовых купюр
    val remainingAfterTwenty = remainingAfterFifty % 20 // Остаток после 20$ купюр

    // Размен остатка на купюры по 10 долларов
    val ten = remainingAfterTwenty / 10        // Количество десятидолларовых купюр
    val remainingAfterTen = remainingAfterTwenty % 10 // Остаток после 10$ купюр

    // Размен остатка на купюры по 5 долларов
    val five = remainingAfterTen / 5           // Количество пятидолларовых купюр
    val remainingAfterFive = remainingAfterTen % 5 // Остаток после 5$ купюр

    // Размен остатка на купюры по 2 доллара
    val two = remainingAfterFive / 2           // Количество двухдолларовых купюр
    val remainingAfterTwo = remainingAfterFive % 2 // Остаток после 2$ купюр

    // Оставшаяся сумма выдается однодолларовыми купюрами
    val one = remainingAfterTwo                // Количество однодолларовых купюр

    // Вывод результата размена
    println("Вам доступно:")
    println("100\$ - ${hundred}шт")    // Сто долларовые купюры
    println("50\$ - ${fifty}шт")       // Пятьдесят долларовые купюры
    println("20\$ - ${twenty}шт")      // Двадцать долларовые купюры
    println("10\$ - ${ten}шт")         // Десять долларовые купюры
    println("5\$ - ${five}шт")         // Пять долларовые купюры
    println("2\$ - ${two}шт")          // Два долларовые купюры
    println("1\$ - ${one}шт")          // Один долларовые купюры
}