package OOP

class Smartphone (
    val model: String,
    val year: Int
) {
    fun getInfo(): String {
        return "Модель: $model, Год: $year"
    }
}

fun main() {
    val myPhone = Smartphone("Pixiel 7", 2022)
    println(myPhone.getInfo())
}