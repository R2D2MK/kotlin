package arrays

fun main(){
    val numberOfColonists = readln().toInt() // команда toInt() приводит значение String к Int
    val colonistsData = Array<String>(numberOfColonists) { "" } // создает массив, каждый из элементов является пустой строкой

    for(index in colonistsData.indices) {
        colonistsData[index] = readln() // считываем данные по колонистам
    }

    for(colonistData in colonistsData) {
        val data = colonistData.split(";")
        val colonistName = data[0].toInt() // имя колониста
        val amountOfFood = data[1].toInt() // количество еды
        val amountOfWater = data[2].toInt() // количество воды
        val amountOfAir = data[3].toInt() // количество воздуха

       if (amountOfFood < 10 )
           println("Колонист $colonistName, у вас заканчивается провиант, пожалуйста, снизьте затраты")
       if (amountOfWater < 25)
            println("Колонист $colonistName, у вас заканчивается вода, пожалуйста, снизьте нагрузку на организм")
        if (amountOfAir < 30)
            println("Колонист $colonistName, у вас наблюдается перерасход кислорода, проконсультируйтесь с медицинским роботом")

        println()
    }
}