package setMap

fun main() {
    val input = readln().toInt()
    val setValue = mutableSetOf<Int>()
    repeat(input){
        setValue.add(readln().toInt())
    }
    println(setValue)
}