package function

fun main() {
    val satelliteOne = readln().toFloat()
    val satelliteTwo = readln().toFloat()
    val satelliteThree = readln().toFloat()
    val satelliteFour = readln().toFloat()
    val satelliteFive = readln().toFloat()

    val result = calculateAvgTemperature(satelliteOne, satelliteTwo, satelliteThree, satelliteFour, satelliteFive)
    print(result)

}
fun calculateAvgTemperature(satelliteOne: Float, satelliteTwo: Float, satelliteThree: Float, satelliteFour: Float, satelliteFive: Float): Float {
    val avg = (satelliteOne + satelliteTwo + satelliteThree + satelliteFour + satelliteFive) / 5
    return avg
}

