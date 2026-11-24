//package function
//
//fun findMaxAsteroid(asteroids: Array<Int>): Int {
//    var max = asteroids[0]
//    for (asteroid in asteroids){
//        if (asteroid > max)
//            max = asteroid
//    }
//    return max
//}
//
//fun main() {
//    println("Введите количество астероидов:")
//    val count = readln().toInt()
//
//    if (count < 0) {
//        println("Некорректный ввод")
//        return
//    }
//
//    val asteroids = Array(count){0}
//    for (i in 0 until count) {
//        println("Введите диаметр астероида ${i+1} (м):")
//        asteroids[i] = readln().toInt()
//    }
//    if (asteroids.size != 0) {
//        val maxSize = findMaxAsteroid(asteroids)
//        println("Самый большой астероид: $maxSize м")
//    } else {
//        println("Астероиды не обнаружены")
//    }
//}