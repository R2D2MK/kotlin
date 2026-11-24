//package function
//
//import kotlin.random.Random
//
//fun generateAsteroidField(
//    originalSize: Int,
//    minFragmentSize: Int,
//    maxFragmentSize: Int): Array<Int> {
//    var maxFragments = 0
//    val fragments = mutableListOf<Int>()
//    val random = Random(42)
//    var currentAsteroidSize = originalSize
//    while (currentAsteroidSize > minFragmentSize){
//}
//    return arrayOf()
//}
//
//
//
//fun charTheme.ifElse.split.main() {
//    println("Введите диаметр астероида:")
//    val originalSize = readln().toInt()
//    println("Введите минимальный размер (м):")
//    val minFragmentSize = readln().toInt()
//    println("Введите максимальный размер (м):")
//    val maxFragmentSize = readln().toInt()
//
//    }
//    val field = generateAsteroidField(originalSize, minFragmentSize, maxFragmentSize)
//    println("\nСгенерированное поле астероидов:")
//    displayAsteroids(field)
//
//
//
//fun displayAsteroids(asteroids: Array<Int>) {
//    if (asteroids.size == 0) {
//        println("Астероиды не обнаружены")
//        return
//    }
//    for (i in asteroids.indices) {
//        println("Астероид ${i+1}: ${asteroids[i]} м")
//    }
//}
