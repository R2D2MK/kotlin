package corporation

data class ApplianceCard(
    override val name: String,
    override val brand: String,
    override val price: Int,
    val wattage: Int
) : ProductCard(name, brand, price, ProductType.APPLIANCE) {

//    override fun toString(): String {
//        return "Name: $name Brand: $brand Price: $price Product type: ${productType.title} Wattage: $wattage"
//    }
}


//FoodCard, ApplianceCard, ShoeCard — НАСЛЕДНИКИ
//Каждый товар по-своему: еда (калории), приборы (ватты), обувь (размер)
//Переопределяют printInfo() - добавляют свои параметры