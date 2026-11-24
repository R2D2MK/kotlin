package delivery

class Cargo(
    var length: Int,
    var width: Int,
    var height: Int,
    var typePackaging: String,
    var netWeight: Double,
    var grossWeight: Double
) {

    fun printInfo() {
        println("Длина: ${this.length}")
        println("Ширина: ${this.width}")
        println("Высота: ${this.height}")
        println("Тип упаковки: ${this.typePackaging}")
        println("Вес нетто: ${this.netWeight} кг")
        println("Вес брутто: ${this.grossWeight} кг")
    }
}