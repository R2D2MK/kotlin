package stringTheme

fun main() {
    val sentence = readln()
    val countChar: Int = sentence.length

    for (i in countChar - 1 downTo 0) {
        print(sentence[i])
    }
}