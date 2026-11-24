fun main() {
    // Читаем общую сумму долларов для размена
    val dollar = readln().toInt()

    // Вычисляем количество купюр каждого номинала
    val hundred = dollar / 100  // Сто долларовые купюры
    val fifty = (dollar - (hundred * 100)) / 50  // Пятьдесят долларовые (остаток после 100$)
    val twenty = (dollar - (hundred * 100) - (fifty * 50)) / 20  // Двадцать долларовые (остаток после 100$ и 50$)
    val ten = (dollar - (hundred * 100) - (fifty * 50) - (twenty * 20)) / 10  // Десять долларовые
    val five = (dollar - (hundred * 100) - (fifty * 50) - (twenty * 20) - (ten * 10)) / 5  // Пять долларовые
    val two = (dollar - (hundred * 100) - (fifty * 50) - (twenty * 20) - (ten * 10) - (five * 5)) / 2  // Два долларовые
    val one = (dollar - (hundred * 100) - (fifty * 50) - (twenty * 20) - (ten * 10) - (five * 5) - (two * 2)) / 1  // Один долларовые

    // Вывод результата размена
    println("Вам доступно:")
    println("100$-${hundred}шт")  // Сто долларовые купюры
    println("50$-${fifty}шт")     // Пятьдесят долларовые купюры
    println("20$-${twenty}шт")    // Двадцать долларовые купюры
    println("10$-${ten}шт")       // Десять долларовые купюры
    println("5$-${five}шт")       // Пять долларовые купюры
    println("2$-${two}шт")        // Два долларовые купюры
    println("1$-${one}шт")        // Один долларовые купюры
}