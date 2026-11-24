package less_3_2

class Car {
    val brand: String
    val model: String
    val bodyColor: String
    val enginePower: Int

    constructor(brand: String, model: String, bodyColor: String, enginePower: Int) {
        this.brand = brand
        this.model = model
        this.bodyColor = bodyColor
        this.enginePower = enginePower
    }

    fun printInfo(){
        println("$brand $model $enginePower л.с. $bodyColor")
    }


    fun drive() {
        if (enginePower >= 120) {
            println("Еду быстро, но недалеко на $brand $model")
        } else {
            println("Еду далеко, но небыстро на $brand $model")
        }

    }

    fun refuel(nameFuelStation: String, brandFuel: String, countLiters: Int) {
        println(
            "Произведена заправка на АЗС \"$nameFuelStation\"\n" +
                    "Марка бензина: $brandFuel\n" +
                    "Кол-во литров: $countLiters"
        )
    }
}


//
//fun task() {
//    val (brand, model, enginePower, bodyColor) = readln().split(" ")
//    val power = enginePower.toInt()
//
//    val myCar = Car(brand, model, bodyColor, power)
//    myCar.printInfo()
//}


