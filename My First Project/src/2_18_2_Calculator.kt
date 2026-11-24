fun main() {
    print("input mathematical example: ")
    val mathematicalExample = readln().split(" ")
    val firstNumber = mathematicalExample[0].toDouble()
    val operation = mathematicalExample[1]
    val secondNumber = mathematicalExample[2].toDouble()
    var result = 0.0

    if (operation == "+") {
        result = firstNumber + secondNumber
    } else if (operation == "-") {
        result = firstNumber - secondNumber
    } else if (operation == "*") {
        result = firstNumber * secondNumber
    } else if (operation == "/") {
        result = firstNumber / secondNumber
    }
    println("Result of a mathematical operation: $firstNumber $operation $secondNumber = $result")
}