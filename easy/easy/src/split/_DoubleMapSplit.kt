package split

fun main() {
    val (a, b) = readln().split(' ').map(String::toDouble)
    if (Math.round(a) == Math.round(b)){
        println("Да")
    } else {
        println("Нет")
    }
}