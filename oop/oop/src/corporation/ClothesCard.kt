package corporation

data class ClothesCard(
    override val name: String,
    override val brand: String,
    override val price: Int,
    val material: String
) : ProductCard(name, brand, price, ProductType.CLOTHES) {


//    override fun toString(): String {
//        return "Name: $name Brand: $brand Price: $price Product type: ${productType.title} Material: $material"
//    }
}