package forEach

fun main() {
    val countries = mutableListOf("USA", "Slovakia", "China")
    countries.removeAt(0)
    countries.add("Portugal")
    val filterA = countries.filter { it.contains('a', ignoreCase = true) }
    println(filterA)

    val countryLengths: MutableMap<String, Int> = mutableMapOf()
    countries.forEach { countryName ->
        val length = countryName.length
        println("Обрабатываю: $countryName, длина: $length")
        countryLengths[countryName] = length
    }

    println("--- Результат ---")
    println(countryLengths)
}

