package split

fun main() {
    // Запрашиваем общее количество менеджеров
    println("Введите количество менеджеров:")
    val managerCount = readln().toInt()

    // Создаём списки: для имён и для продаж (по индексу будут связаны)
    val managerName = mutableListOf<String>()
    val managerSales = mutableListOf<Int>()
    var managerLoser = false  // Флаг: были ли менеджеры с продажами < 3

    // Собираем имена менеджеров
    println("Введите ФИО менеджеров:")
    for (i in 1..managerCount) {
        val name = readln()
        managerName.add(name)
    }

    // Собираем их продажи (в том же порядке!)
    println("Введите продажи менеджеров:")
    for (i in 1..managerCount) {
        val sales = readln().toInt()
        managerSales.add(sales)
    }

    println()
    println("Неэффективные менеджеры:")
    // Перебираем по индексам — чтобы имя и продажи соответствовали одному человеку
    for (index in managerSales.indices) {
        val sale = managerSales[index]  // Продажи текущего менеджера
        if (sale < 3) {
            managerLoser = true         // Нашли хотя бы одного "неэффективного"
            println(" - ${managerName[index]} | Продажи: $sale")
        }
    }

    // Если ни один менеджер не провалил норму — выводим "Не найдены"
    if (!managerLoser) println(" - Не найдены")
}