package testFinal

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    var maxValue = 0
    var found = false

    for (i in a..b) {
        if (i % 7 == 0) {
            found = true
            maxValue = i
        }
    }
    if (found) {
        println(maxValue)
    } else {
        println("NO")
    }
}