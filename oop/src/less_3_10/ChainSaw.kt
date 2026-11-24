package less_3_10

class ChainSaw(
    //цепная пила
//    val chainSawTireLength: Int,    //длина шины
//    val chainLinksCount: Int,   //кол-во звеньев цепи
//    val chainStep: Double,  //шаг цепи
    brand: String,
    model: String,
    power: Int,
//    weight: Double,
//    cableLength: Int,
//    price: Price,
//    voltage: Int,
) : PowerTool(brand, model, power) {
    override fun turnOn() {
        println("Цепная пила пилит")
    }
}