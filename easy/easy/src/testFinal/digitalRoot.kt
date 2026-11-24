package testFinal

fun main() {
// 1. Прочитать число
val n = readln().toInt()

// 2. Начать с него
var current = n

// 3. Повторять, пока current не станет однозначным
while (current >= 10) {
    // 4. Посчитать сумму цифр current
    var sum = 0
    var temp = current          // работаем с копией!
    while (temp > 0) {
        sum += temp % 10        // добавить последнюю цифру
        temp /= 10              // отбросить её
    }
    // 5. Обновить current — теперь он равен сумме
    current = sum
}

// 6. Вывести результат
println(current)
}