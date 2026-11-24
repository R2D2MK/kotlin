package stringTheme

fun main() {
    val sentence = readln()
    val k = readln().toInt()

    for (i in sentence.indices){
        if (i == k - 1) continue
        print(sentence[i])
    }

}