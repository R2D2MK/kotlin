//fun filterAsteroidsBySize(asteroids: Array<Int>, minSize: Int): Array<Int> {
//    val dangerousAsteroids = mutableListOf<Int>()
//    for (badAsteroids in asteroids){
//        if (badAsteroids > minSize){
//            dangerousAsteroids.add(badAsteroids)
//        }
//    }
//    return dangerousAsteroids.toTypedArray()
//}
//
//fun displayAsteroids(asteroids: Array<Int>, minSize: Int = 0) {
//    if (asteroids.size == 0) {
//        println("Астероиды не обнаружены")
//        return
//    }
//    asteroids.forEachIndexed { index, asteroid ->
//        println("Астероид $index: $asteroid} м")
//    }
//}
//    fun sortAsteroidsBySize(asteroids: Array<Int>): Array<Int> {
//        return asteroids.sortedDescending().toTypedArray()
//    }
//fun main() {
//    println("Введите количество астероидов:")
//    val count = readln().toIntOrNull() ?: 0
//
//    if (count < 0) {
//        println("Некорректный ввод")
//        return
//    }
//
//    val asteroids = Array(count){0}
//    for (i in 0 until count) {
//        println("Введите диаметр астероида ${i+1} (м):")
//        asteroids[i] = readln().toIntOrNull() ?: 0
//    }
//    val sorted = sortAsteroidsBySize(asteroids)
//    println("\nАстероиды по возрастанию размера:")
//    displayAsteroids(sorted)
//
//    println("Введите минимальный опасный размер (м):")
//    val minSize = readln().toIntOrNull() ?: 0
//
//
//    val hazardous = filterAsteroidsBySize(asteroids, minSize)
//    println("\nОпасные астероиды (диаметр > ${minSize}м):")
//    displayAsteroids(hazardous)
//}
//
//
