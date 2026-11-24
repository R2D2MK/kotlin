package testFinal

fun main() {
    val n = readln().toInt()
    val s = readln()

    var countA = 0
    var delSymbol = 0

    for (char in s) {
        if (char == 'a') {
            countA++
        }
        else {
            if (countA >= 4) {
                delSymbol += countA - 3
            }
            countA = 0
            }

        }
    if (countA >= 4){
        delSymbol += countA - 3
    }
    println(delSymbol)
}


