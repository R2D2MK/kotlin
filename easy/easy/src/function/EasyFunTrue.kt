package function

fun main() {
    val s = readln()
    fun isCapitalized (s: String): Boolean {
        if(s.decapitalize() == s){
            return false
        }
        else return true
    }
    print(isCapitalized(s))

}