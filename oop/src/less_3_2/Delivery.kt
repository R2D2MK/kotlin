package less_3_2

class DeliveryObject( // объект доставки
    val length: Int,
    val width: Int,
    val height: Int,
    val weight: Double
)

class Pack( // упаковка
    val length: Int,
    val width: Int,
    val height: Int,
    val type: String = "Картонная коробка",
    val weight: Double
)

class Cargo( // упакованный груз, готовый к отправке
    val length: Int,
    val width: Int,
    val height: Int,
    val typePackaging: String,
    val netWeight: Double, // - вес нетто (вес груза без упаковки)
    val grossWeight: Double // - вес брутто (вес груза c упаковкой)
) {
    fun printInfo() {
        println("Длина: $length")
        println("Ширина: $width")
        println("Высота: $height")
        println("Тип упаковки: $typePackaging")
        println("Вес нетто: $netWeight")
        println("Вес брутто: $grossWeight")
    }
}

class Warehouse { //  Склад
    fun getPack(deliveryObject: DeliveryObject): Pack { //получить упаковку
        return Pack(
            length = deliveryObject.length + 1,
            width = deliveryObject.width + 1,
            height = deliveryObject.height + 1,
            weight = 0.3
        )
    }

    fun packCargo(deliveryObject: DeliveryObject): Cargo { // упаковать груз (метод, который соединяет всё воедино.)
        val pack = getPack(deliveryObject)
        val totalWeight = deliveryObject.weight + pack.weight
        return Cargo(
            length = pack.length,
            width = pack.width,
            height = pack.height,
            typePackaging = pack.type,
            netWeight = deliveryObject.weight,
            grossWeight = totalWeight
        )
    }
}


fun main() { //в ДЗ должно быть task()
    val input = readln().split(" ")
    val myLength = input[0].toInt()
    val myWidth = input[1].toInt()
    val myHeight = input[2].toInt()
    val myWeight = input[3].toDouble()

    val myObject: DeliveryObject = DeliveryObject(myLength, myWidth, myHeight, myWeight)

    val warehouse: Warehouse = Warehouse()
    val resultCargo = warehouse.packCargo(myObject)
    resultCargo.printInfo()
}