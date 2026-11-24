fun main() {
    val numbers = readln().split(' ').map(String::toInt)
    val a = numbers[0]
    val b = numbers[1]
    val c = numbers[2]

       val moneyPersonal = (a + b).toDouble() / c

    var discountPercent = 0.0

    if (moneyPersonal < 10_000) {
        discountPercent = 50.0
    } else if (moneyPersonal < 12_000) {
        discountPercent = 40.0
    } else if (moneyPersonal < 16_000) {
        discountPercent = 30.0
    } else if (moneyPersonal < 18_000) {
        discountPercent = 20.0
    } else if (moneyPersonal < 20_000) {
        discountPercent = 10.0
    } else {
        discountPercent = 0.0
    }

    val discount = 100_000 * discountPercent / 100
    println(discount.toInt())
}