package corporation

data class FoodCard(
    override val name: String,
    override val brand: String,
    override val price: Int,
    val caloric: Int,

    ) : ProductCard(name, brand, price, ProductType.FOOD) {

//    override fun toString(): String {
//        return "Name: $name Brand: $brand Price: $price Product type: ${productType.title} Calories: $caloric"
//    }
}

//FoodCard, ApplianceCard, ShoeCard — НАСЛЕДНИКИ
//Каждый товар по-своему: еда (калории), приборы (ватты), обувь (размер)
//Переопределяют printInfo() - добавляют свои параметры
