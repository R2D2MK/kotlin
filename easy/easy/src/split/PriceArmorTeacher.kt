package split

fun main(){
    val firstLine = readln() // считываем первую строку
    val firstLineData = firstLine.split(": ") // с помощью команды split делим строку на части на основании условия
    val count = firstLineData[1].toInt() // обращаемся ко второму элементу массива (строке) и приводим к типу Int

    val array = Array<Int>(count) { 0 }
    for(number in 0 until count){
        val data = readln()
        val informationArray = data.split(": ")
        val price = informationArray[1]
        array[number] = price.toInt()
    }

    var sum = 0
    for(number in array){
        sum += number
    }

    print("На основании полученных данных затраты на снаряжение одного бойца составляет $sum кредитов")
}