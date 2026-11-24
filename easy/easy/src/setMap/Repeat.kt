package setMap

fun main() {
    val text = "И вот тут, напишем что угодно"
    val result = mutableMapOf<Char, Int>()
    for (i in text){
        val currentNumber = result.getOrDefault(i, 0)
        result[i] = currentNumber + 1
    }
    println(result)
}