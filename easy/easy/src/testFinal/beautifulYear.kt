package testFinal

fun main() {
    // Читаем исходный год
    val firstYear = readln().toInt()
    // Начинаем поиск со следующего года
    var candidateYear = firstYear + 1

    while (true) {
        // Извлекаем каждую цифру года (от тысяч до единиц)
        val d4 = candidateYear % 10          // единицы
        val d3 = candidateYear / 10 % 10     // десятки
        val d2 = candidateYear / 100 % 10    // сотни
        val d1 = candidateYear / 1000        // тысячи

        // Проверяем, что все четыре цифры разные
        if (d1 != d2 && d1 != d3 && d1 != d4 &&
            d2 != d3 && d2 != d4 &&
            d3 != d4) {
            // Нашли подходящий год — выводим и завершаем
            println(candidateYear)
            break
        } else {
            // Год не подходит — проверяем следующий
            candidateYear++
        }
    }
}