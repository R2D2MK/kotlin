package testFinal

fun main() {
    val inputString = readln()
    val inputNumber = readln().toInt()
    val stringLength = inputString.length

    if (inputNumber > stringLength) {
        println("NO")
    } else {
        val k = inputString[inputNumber - 1]
        println(k)
    }
}
