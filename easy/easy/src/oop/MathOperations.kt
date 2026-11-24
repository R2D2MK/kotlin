package oop

class MathOperations{
    fun add(valueOne:Int, valueTwo:Int):Int = valueOne + valueTwo
    fun subtract(valueOne:Int, valueTwo:Int):Int = valueOne - valueTwo
    fun multiply(valueOne:Int, valueTwo:Int):Int = valueOne * valueTwo
    fun divide(valueOne:Int, valueTwo:Int):Int = valueOne / valueTwo

    fun add(valueOne: Double, valueTwo:Double):Double = valueOne + valueTwo
    fun subtract(valueOne:Double, valueTwo:Double):Double = valueOne - valueTwo
    fun multiply(valueOne:Double, valueTwo:Double):Double = valueOne * valueTwo
    fun divide(valueOne:Double, valueTwo:Double):Double = valueOne / valueTwo

}

fun main() {
    val typeData = readln().trim()
    val operation  = readln().trim()
    val math = MathOperations()
     when (typeData) {
        "Int" -> {
            val inputOne = readln().toIntOrNull() ?: 0
            val inputTwo = readln().toIntOrNull() ?: 0
            val result = when (operation ) {
                "add" -> {math.add(inputOne,inputTwo)}
                "subtract" -> {math.subtract(inputOne,inputTwo)}
                "multiply" -> {math.multiply(inputOne,inputTwo)}
                "divide" -> {math.divide(inputOne,inputTwo)}
                else -> 0
            }
            println(result.toDouble())
        }
        "Double" -> {
            val inputOne = readln().toDoubleOrNull() ?: 0.0
            val inputTwo = readln().toDoubleOrNull() ?: 0.0
            val result = when (operation) {
                "add" -> math.add(inputOne,inputTwo)
                "subtract" -> {math.subtract(inputOne,inputTwo)}
                "multiply" -> {math.multiply(inputOne,inputTwo)}
                "divide" -> {math.divide(inputOne,inputTwo)}
                else -> 0.0
            }
            println(result)
        }
    }

}