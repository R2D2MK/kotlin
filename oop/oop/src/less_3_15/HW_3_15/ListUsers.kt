package less_3_15.HW_3_15

fun task(listUser: List<String>): List<String> {
    val users = listUser.toMutableList()
    val input = readln()

    fun printInfo() {
        for (user in users) {
            println(user)
        }
    }
    when (input) {
        "SHOW" -> printInfo()
        "ADD" -> {
//            println("Enter name new user: ")
            val newUser = readln()
            users.add(newUser)
            printInfo()
        }

        "REMOVE" -> {
//            println("Enter name user for remove: ")
            val removeUser = readln()
            users.remove(removeUser)
            printInfo()
        }

        "REMOVE_AT" -> {
//            println("Enter index user for remove: ")
            val removeUserIndex = readln().toInt()
            users.removeAt(removeUserIndex)
            printInfo()
        }

        else -> println("Некорректное значение")
    }
    return users.toList()
}

