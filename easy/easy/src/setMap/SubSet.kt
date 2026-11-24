package setMap

fun main() {
    val input = readln().toInt()
    val subSet = mutableSetOf<Any>()
    repeat(input){
        subSet.add(readln())
    }
    val inputTwo = readln().toInt()
    val superSet = mutableSetOf<Any>()
    repeat(inputTwo){
        superSet.add(readln())
    }
    val isSubset = subSet.all { it in superSet }
    println(isSubset)
}