fun main() {
    val brands = listOf("AUDI", "BMW", "LADA")
    print("Enter brand auto: ")
    val inputBrand = readln()
    var searchBrand = false
    var index = 0

    while (index < brands.size) {
        if (inputBrand == brands[index]) {
            searchBrand = true
            break
        } else {
            index++
        }
    }
    print(searchBrand)
}