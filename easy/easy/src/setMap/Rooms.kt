package setMap

fun main() {
    val room1 = listOf("Стол", "Стул", "Компьютер", "Стул")
    val room2 = listOf("Компьютер", "Лампа", "Шкаф", "Стол")
    val room3 = listOf("Стул", "Шкаф", "Телевизор", "Лампа")

    val roomAll = room1 + room2 + room3
    println(roomAll)
    val setAll = roomAll.toSet()
    println(setAll)
    val listAll = setAll.toList()
    println(listAll[2])
}


