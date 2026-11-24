package loops

fun main() {
    var sum = 0
    for (i in 0..20 step 2) {
        sum += i
    }
    println("Сумма четных чисел от 1 до 20: $sum")

}