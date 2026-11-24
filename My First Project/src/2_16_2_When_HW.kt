fun main() {
    val weight = readln().toInt()
    val price = when {
        weight < 2 -> 150
        weight < 5 -> 200
        weight < 12 -> 250
        weight < 18 -> 300
        weight < 30 -> 350
        weight < 200 -> 1000
        else -> "Для расчета стоимости свяжитесь с менеджером."
    }
    if (weight in 0 until 200) {
        println("$price руб./км.")
    } else {
        println(price)
    }
}