fun main() {
    print("Enter Password: ")
    val password = readln().toCharArray()
    var containsSpecialSymbol = false
    for (symbol in password) {
        if (symbol == 'Ъ') {
            containsSpecialSymbol = true
        }
    }
        if (containsSpecialSymbol) {
            println("У вас идеальный пароль!")
        } else {
            println("Опс! В вашем пароле кое-чего не хватает.")
        }
    }