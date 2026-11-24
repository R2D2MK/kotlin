//val correctNumber = Random.nextInt(100)
// Создаётся переменная correctNumber, которая хранит случайное целое число от 0 до 99
// Для этого используется метод рандома Random.nextInt(100) из библиотеки Kotlin.
// var win = false
// Объявляется переменная win, которая будет использоваться как флаг окончания игры.
// Изначально игра не выиграна (false), поэтому цикл продолжает работать.
// Основной игровой цикл: while (!win)
// Запускается цикл while, который работает до тех пор, пока win не станет true
//  Пока пользователь не угадает число, цикл повторяется снова и снова
// Что происходит после угадывания?
// Цикл while останавливается, программа заканчивает работу.

import kotlin.random.Random

fun main() {
    val correctNumber = Random.nextInt(100)
    var win = false

    while (!win) {
        println("Enter number from 0 to 100: ")
        val number = readln().toInt()
        if (number < correctNumber) {
            println("Your number is lower")
        } else if (number > correctNumber) {
            println("Your number is higher")
        } else {
            win = true
            println("Your number is correct!!!")
        }
    }
}
