package setMap

fun main() {
    val numbersList = mutableListOf(1, 2, 1, 2, 4)
    val numbersSet = mutableSetOf(1, 2, 1, 2, 4)

    numbersList.add(5)
    numbersSet.add(5)

    numbersList.remove(2)
    numbersSet.remove(2)


    println(numbersList)
    println(numbersSet)

    println(numbersList.size)
    println(numbersSet.size)
}