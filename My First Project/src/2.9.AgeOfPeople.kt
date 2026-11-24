fun main() {
    // Запрашиваем возраст Максима
    println("Input age Maxim: ")
    val ageMaxim = readln().toInt()  // Читаем возраст и преобразуем в число

    // Запрашиваем возраст Бонса
    println("Input age Bones: ")
    val ageBones = readln().toInt()  // Читаем возраст и преобразуем в число

    // Сравниваем возрасты и выводим результат
    if (ageMaxim > ageBones) {
        // Если возраст Максима больше возраста Бонса
        println("Maxim is older than Bones")
    } else if (ageBones > ageMaxim) {
        // Если возраст Бонса больше возраста Максима
        println("Bones is older than Maxim")
    } else {
        // Если возрасты равны
        println("Maxim is the same age as Bones")
    }
}