fun main() {
    print("input radius: ")
    val radius = readln().toDouble()
    val circumference = 2 * 3.14 * radius
    val areaCircle = 3.14 * (radius * radius)

    println("Радиус: $radius")
    println("Длина окружности: $circumference")
    println("Площадь круга: $areaCircle")
}