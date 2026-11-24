fun main() {
    print("input the first number: ")
    val firstNumber = readln().toDouble()
    print("input a mathematical operation (+ - * /): ")
    val operation = readln()
    print("input the second number: ")
    val secondNumber = readln().toDouble()
    var result = 0.0
    if (operation == "+") {
        result = firstNumber + secondNumber
    }
    else if (operation == "-") {
        result = firstNumber - secondNumber
    }
    else if (operation == "*") {
        result = firstNumber * secondNumber
    }
    else if (operation == "/") {
        result = firstNumber / secondNumber
    }
    println("Result of a mathematical operation: $firstNumber $operation $secondNumber = $result")
}