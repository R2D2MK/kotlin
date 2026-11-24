package split

fun main() {
    println("Введите название планеты:")
    val planetName = readln()
    println("Введите текущий день в месяце:")
    val day =readln().toInt()
    val dayString = if (day < 10) "0" + day else day.toString()

    val firstLetter = planetName[0]
    val codeLetter = firstLetter.code
    val firstNumber = dayString[0]
    val codeNumber = firstNumber.code

    val codeGenerate = (codeLetter + codeNumber + day) % 26
//    (Код_первой_буквы_из_названия_планеты + Код_первой_цифры_из_дня_месяца + день) % 26)
    val accessCode = "Новый код доступа - $firstLetter$dayString$codeGenerate"
    println(accessCode)
}