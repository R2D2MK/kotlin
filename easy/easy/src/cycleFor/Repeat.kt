package cycleFor

fun main() {
val test = mutableListOf<Int>()

    repeat(10){
        test.add((1..500).random())
    }
    println(test)
}
