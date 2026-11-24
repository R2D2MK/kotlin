package testFinal

fun main() {
    val startSymbol = readln().single()
    val endSymbol = readln().single()

    if (startSymbol > endSymbol) {
        for (i in endSymbol .. startSymbol) {
            print("$i ")
        }

    } else {
        for (i in startSymbol..endSymbol)
            print("$i ")
    }

}