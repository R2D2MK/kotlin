package less_3_10

open class PowerTool(
    //электроинструмент
    val brand: String, //марка
    val model: String, //модель
    val power: Int, //мощность
//    val weight: Double, //вес
//    val cableLength: Int, //длина кабеля
//    val price: Price, //цена
//    val voltage: Int, //напряжение
) {
    open fun turnOn() {
        println("PowerTool is turned on")
    }
}

fun main() {
    val drill = Drill("Bosch", "MK", 220)
    val chainSaw = ChainSaw("DWalt", "nn", 220)
    val angleGrinder = AngleGrinder("Makita", "666", 220)
    val electroTools = listOf<PowerTool>(drill, chainSaw, angleGrinder)
    for (electroTool in electroTools) {
        electroTool.turnOn()
    }
}
