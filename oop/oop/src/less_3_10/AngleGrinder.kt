package less_3_10

class AngleGrinder(
    //УШМ
//    val discDiameter: Int, //диаметр диска
//    val isSmoothStart: Boolean, //наличие системы плавного пуска
//    val isDustProtection: Boolean, //наличие защиты от пыли
    brand: String,
    model: String,
    power: Int
//    weight: Double,
//    cableLength: Int,
//    price: Price,
//    voltage: Int,
) : PowerTool(brand, model, power) {
    override fun turnOn() {
        println("УШМ режет")
    }
}