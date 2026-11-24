package function

import kotlin.system.exitProcess

fun registerPackage() {
    println("Введите имя получателя:")
    val nameRecipient = readln()
    println("Желаете зарегистрировать груз? (Да/Нет)")
    val registerSend = readln()
    if (registerSend == "Нет") {
        return
    } else if (registerSend == "Да") {
        println("Груз зарегистрирован\n")
        return
    }
}

fun sendPackage() {
    println("Желаете отправить последний зарегистрированный груз? (Да/Нет)")
    val input = readln()
    if (input == "Да") {
        println("Груз ожидает отправки. Благодарим за использование нашего терминала!")
        return
    } else return
}

fun receivePackage() {
    println("Введите ваше имя:")
    val nameReceiver = readln()
    println("Желаете получить груз? (Да/Нет)")
    val receive = readln()
    if (receive == "Нет") {
        return
    } else if (receive == "Да") {
        println("Груз выдан. Благодарим за использование нашего терминала!")
        return
    }
}

fun main() {
    do {
        val inputCommand = readln()

        when (inputCommand) {
            "Зарегистрировать груз" -> {
                registerPackage()
            }

            "Отправить груз" -> {
                sendPackage()
            }

            "Выдать груз" -> {
                receivePackage()
            }
        }
    } while (inputCommand != "Закончить работу с терминалом")
}