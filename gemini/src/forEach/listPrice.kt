package forEach

        fun main() {
            val prices = listOf(10, 20, 30, 40)
            val doubledPrices: MutableList<Int> = mutableListOf()
            prices.forEach { price ->
                doubledPrices.add(price * 2) }
            println(doubledPrices)
        }