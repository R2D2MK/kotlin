fun main() {
    print("Enter Password: ")
    val password = readln().toCharArray()
    var containsLetter = false
    var containsDigit = false
    var containsSpecialSymbol = false
    val size: Boolean = password.size >= 8
    for (symbol in password) {
        if (symbol.isLetter()) {
            containsLetter = true
        } else if (symbol.isDigit()) {
            containsDigit = true
        } else if (!symbol.isLetterOrDigit()) {
            containsSpecialSymbol = true
        }
    }
    if (containsLetter && containsDigit && containsSpecialSymbol && size) {
        println("Your password super")
    } else {
        println("Your password shit")
    }
}