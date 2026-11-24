fun initRepair() {
    println("Запущен процесс авторемонта ...")

    var cooldown = 5
    while(cooldown > 0) {
        println("До запуска робота $cooldown")
        cooldown--
    }

    println("Ремонт завершён")
}
fun main() {

    println("Желаете починить робота? (Да/Нет)")
    val userAnswer = readln()

    if(userAnswer == "Да") {
        val startRepair = initRepair()
    } else {
        println("Вы отказались от ремонта")
    }
}

