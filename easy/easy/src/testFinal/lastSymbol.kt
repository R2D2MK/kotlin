package testFinal

fun main() {

    val n = readln().toInt()

    var original = n    // сохраним оригинал
    var reversed = 0      // сюда будем собирать перевёрнутое

    while(original > 0){    // Пока original ещё не стал 0:
        val lastDigit = original % 10       // последняя цифра
        reversed = reversed * 10 + lastDigit
        original = original / 10 // отбрасываем последнюю цифру
    }
    if (n == reversed){
        println("YES")
    }
    else println("NO")
}