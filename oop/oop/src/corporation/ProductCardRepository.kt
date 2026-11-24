package corporation

import java.io.File

object ProductCardRepository {

    private val fileProductCard = File("product_cards.txt")
    private val _productsCards = loadAllCards()
    val productsCards
        get() = _productsCards.toList()

    fun registerNewItem(card: ProductCard) {
        _productsCards.add(card)
    }

    fun saveChanges() {
        val content = StringBuilder()
        for (productCard in _productsCards) {
            content.append("${productCard.name}%${productCard.brand}%${productCard.price}%")
            when (productCard) {
                is FoodCard -> {
                    val caloric = productCard.caloric
                    content.append("$caloric%")

                }

                is ApplianceCard -> {
                    val wattage = productCard.wattage
                    content.append("$wattage%")
                }

                is ShoeCard -> {
                    val size = productCard.size
                    content.append("$size%")
                }

                is ClothesCard -> {
                    val material = productCard.material
                    content.append("$material%")
                }
            }
            content.append("${productCard.productType}\n")
        }
        fileProductCard.writeText(content.toString())
    }

    fun removeProductCard(name: String) {
        for (card in _productsCards) {
            if (card.name == name) {
                _productsCards.remove(card)
                break
            }
        }
    }

    private fun loadAllCards(): MutableSet<ProductCard> {
        val cards = mutableSetOf<ProductCard>()
        if (!fileProductCard.exists()) fileProductCard.createNewFile()
        val content = fileProductCard.readText().trim()

        if (content.isEmpty()) {
            return cards
        }

        val cardsAsString = content.split("\n")

        for (card in cardsAsString) {
            val properties = card.split("%")
            val name = properties[0]
            val brand = properties[1]
            val price = properties[2].toInt()
            val type = properties.last()
            val productType = ProductType.valueOf(type)
            val productCard = when (productType) {
                ProductType.FOOD -> {
                    val calories = properties[3].toInt()
                    FoodCard(name, brand, price, calories)
                }

                ProductType.APPLIANCE -> {
                    val wattage = properties[3].toInt()
                    ApplianceCard(name, brand, price, wattage)
                }

                ProductType.SHOE -> {
                    val size = properties[3].toFloat()
                    ShoeCard(name, brand, price, size)
                }

                ProductType.CLOTHES -> {
                    val material = properties[3]
                    ClothesCard(name, brand, price, material)
                }
            }
            cards.add(productCard)
        }
        return cards
    }
}


