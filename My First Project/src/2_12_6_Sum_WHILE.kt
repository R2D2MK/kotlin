fun main() {
    print("Enter number: ")
    val number = readln().toInt()
    var sumInt = 0
    var nextInt = 1

    repeat (number) {
        sumInt = sumInt + nextInt
        nextInt ++
    }
    println("Сумма чисел от 1 до $number равна $sumInt")
}

// или решение через while
//fun main() {
//    print("Введите число N: ")
//    val input = readln().toInt()
//
//    var sum = 0
//    var currentNumber = 1
//
//    while (currentNumber <= input) {
//        sum += currentNumber       // Прибавляем текущее число к сумме
//        currentNumber++            // Увеличиваем currentNumber на 1
//    }
//    println("Сумма чисел от 1 до $input равна $sum")
//}