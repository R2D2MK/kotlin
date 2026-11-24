package corporation

abstract class ProductCard(
    open val name: String,
    open val brand: String,
    open val price: Int,
    val productType: ProductType
) {
    open fun printInfo() {
        println(this)
    }
}

//ProductCard.kt — БАЗОВЫЙ КЛАСС
//Это супер-класс для ВСЕХ товаров
//Содержит: name, brand, price, productType
//Метод: printInfo() - выводит информацию