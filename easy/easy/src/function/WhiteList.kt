package function

fun main() {
    println("Ваш идентификатор?")

    val userId = readln()
    val isValidUserId = checkUserId(userId)
    if(isValidUserId) {
        println ("Доступ разрешён")
    } else {
        println ("Доступ запрещён")
    }
}

fun checkUserId(userId: String): Boolean {
    val whitelistId = arrayOf("TK-01001", "TK-01011")

    return userId in whitelistId
}