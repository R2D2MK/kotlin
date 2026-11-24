fun calculateTip(billAmount: Double,tipPercentage: Int): Double{
    val result = (billAmount * tipPercentage) / 100
    return result
}
fun main() {
    val tip = calculateTip(125.50,18)
    println("Чаевые составляют: $tip")
}

