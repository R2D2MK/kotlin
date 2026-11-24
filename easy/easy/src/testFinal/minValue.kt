package testFinal

fun main() {

val n: Int = readln().toInt() // количество чисел в последовательности

var number: Int

var min = 1000001 // значение заведомо больше возможных значений последовательности


for (i in 0 until n) {
    number = readln().toInt() // очередное число последовательности
    if (number < min) // сравниваем текущее число с min
    {
        min = number // если меньше, то обновляем min
    }
}

println(min) // после просмотра всех чисел последовательности, выводим минимальное значение
}