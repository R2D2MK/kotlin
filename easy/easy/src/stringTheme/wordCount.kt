package stringTheme

fun main() {
    val sentence = readln()
    val countChar: Int = sentence.length

    var countWord = 1

    for (i in 0 until countChar) {
        if (sentence[i] == ' ') {
            countWord ++
        }
    }
    println(countWord)
}