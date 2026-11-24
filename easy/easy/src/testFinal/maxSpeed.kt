package testFinal

fun main() {

    val n: Int = readln().toInt() // количество чисел

    var number: Int

    var max = 0
    var min = 30

    var answer = "NO"


    for (i in 0 until n) {
        number = readln().toInt() // очередное число последовательности
        if (number > max) // сравниваем текущее число с мах
        {
            max = number // если больше, то обновляем мах
        }
        if (number < min){
            answer = "YES"

        }
    }

    println("$max $answer")
}