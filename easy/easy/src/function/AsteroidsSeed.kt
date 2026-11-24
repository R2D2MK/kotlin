package function

fun displayAsteroids(asteroids: Array<Int>) {
    if (asteroids.size == 0) {
        println("Астероиды не обнаружены")
        return
    }
    for (i in asteroids.indices) {
        println("Астероид ${i + 1}: ${asteroids[i]} м")
    }
}

fun generateAsteroidField(
    originalSize: Int,
    minFragmentSize: Int,
    maxFragmentSize: Int
): Array<Int> {
    var asteroidSize = originalSize

    val asteroids: MutableList<Int> = mutableListOf()

    val seed = 42
    val random = kotlin.random.Random(seed)

    while (asteroidSize >= minFragmentSize) {
        val fragmentSize = random.nextInt(minFragmentSize, maxFragmentSize)
        asteroids.add(fragmentSize)
        asteroidSize -= fragmentSize
    }
    if (asteroidSize > 0) {
        asteroids.add(asteroidSize)
    }
    return asteroids.toTypedArray()
}

fun main() {
    println("Введите диаметр астероида:")
    val originalSize = readln().toInt()
    println("Введите минимальный размер (м):")
    val minFragmentSize = readln().toInt()
    println("Введите максимальный размер (м):")
    val maxFragmentSize = readln().toInt()


    val field = generateAsteroidField(originalSize, minFragmentSize, maxFragmentSize)
    println("\nСгенерированное поле астероидов:")
    displayAsteroids(field)
}


