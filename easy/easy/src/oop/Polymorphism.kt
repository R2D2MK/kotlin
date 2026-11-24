package oop

class Calculator {
    fun calculate(valueOne: Int, valueTwo: Int): Int = valueOne + valueTwo
    fun calculate(valueOne: Double, valueTwo: Double): Double = valueOne * valueTwo
    fun calculate(valueOne: String, valueTwo: String): String = valueOne + valueTwo
}


fun main() {
    val inputValue = readln().trim()
    val math = Calculator()

    when (inputValue) {
        "add" -> {
            val inputOne = readln().toIntOrNull() ?: 0
            val inputTwo = readln().toIntOrNull() ?: 0
            println(math.calculate(inputOne, inputTwo))
        }

        "multiply" -> {
            val inputOne = readln().toDoubleOrNull() ?: 0.0
            val inputTwo = readln().toDoubleOrNull() ?: 0.0
            val math = Calculator()
            println(math.calculate(inputOne, inputTwo))
        }

        "concatenate" -> {
            val inputOne = readln().toString()
            val inputTwo = readln().toString()
            val math = Calculator()
            println(math.calculate(inputOne, inputTwo))
        }
    }
}
