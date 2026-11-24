package corporation

data class ShoeCard(
    override val name: String,
    override val brand: String,
    override val price: Int,
    val size: Float
) : ProductCard(name, brand, price, ProductType.SHOE) {

//    override fun toString(): String {
//        return "Name: $name Brand: $brand Price: $price Product type: ${productType.title} Size: $size"
//    }
}

//FoodCard, ApplianceCard, ShoeCard — НАСЛЕДНИКИ
//Каждый товар по-своему: еда (калории), приборы (ватты), обувь (размер)
//Переопределяют printInfo() - добавляют свои параметры