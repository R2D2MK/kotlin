package charTheme

fun main() {
    val start: Char = readln().single()
    val digital: Int = start.code

    if (digital in 97..122){
        val smallToBig: Char = start.toUpperCase()
        println(smallToBig)
    }
    else if (digital in 65..90){
        val bigToSmall: Char = start.toLowerCase()
        println(bigToSmall)
    }
    else println("input correct symbol")
}