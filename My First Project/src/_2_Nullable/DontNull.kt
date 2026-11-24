package _2_Nullable

fun main() {
    var result = readLine()
    if (result == "null") {
        result = null
    }
    result?.let {
        println(it)
    }
}