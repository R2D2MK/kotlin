package function

fun main() {
    val a = readln().toBoolean()
    val b = readln().toBoolean()
    val c = readln().toBoolean()

    println(majorityDecision(a,b,c))

}
fun majorityDecision(a : Boolean, b: Boolean, c: Boolean): Boolean {
    return (a && b) || (a && c) || (b && c)

}