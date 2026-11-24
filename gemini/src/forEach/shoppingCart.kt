package forEach

fun main() {
    val shoppingCart = mapOf(
        "Milk" to 2,
        "Bread" to 3,
        "Eggs" to 5
    )
    var total = 0
    shoppingCart.forEach { entry ->
       total += entry.value
    }
    println(total)
}