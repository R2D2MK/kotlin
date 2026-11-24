package split

fun main() {
            val inputData = "Имя: Ben Kirbi Tennison: mk: mmmm: qqq"
        val splitData = inputData.split(": ") // Делим строку по разделителю
        val userName = splitData[2] // Берем третью часть

        println(userName) // Результат: "mk"

    }
