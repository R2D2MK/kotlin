package setMap

fun main() {
    val text = "Привет, как у тебя дела?"
    println(text.length)
    val setText = text.toSet()
    println(setText)
    val stringText = setText.toString()
    println(stringText)
    println(stringText[0])

    val correctString = setText.joinToString("")
    println(correctString)
    println(correctString.length)
}