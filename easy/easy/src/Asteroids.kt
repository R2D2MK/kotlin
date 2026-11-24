fun displayAsteroids(asteroids: Array<Int>) {
    for ( i in asteroids.indices){
        println("Астероид ${i+1}: ${asteroids[i]} м")

    }
fun main() {
    println("Введите количество астероидов:")
    val count = readln().toInt()

    if (count < 0) {
        println("Некорректный ввод")
        return
    }

    val asteroids = Array<Int>(count){0}
    for (i in 0 until count) {
        println("Введите диаметр астероида ${i+1} (м):")
        asteroids[i] = readln().toInt()
    }

    println("\nРезультаты сканирования:")
    displayAsteroids(asteroids)
}


}
