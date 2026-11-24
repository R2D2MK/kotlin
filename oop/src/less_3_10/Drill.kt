package less_3_10

class Drill(
//    val drillChuckDiameter: Int, // диаметр сверлильного патрона
//    val minRotationSpeed: Int, // минимальная скорость вращения
//    val maxRotationSpeed: Int, // максимальная скорость вращения
    brand: String,
    model: String,
    power: Int,
//    weight: Double,
//    cableLength: Int,
//    price: Price,
//    voltage: Int
) : PowerTool(brand, model, power) {
    override fun turnOn() {
        println("Дрель сверлит")
    }
}