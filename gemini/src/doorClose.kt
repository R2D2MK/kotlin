fun main() {
    val isDoorOpen = false
    val isCodeCorrect = true
    val isFaceRecognized = false

    if (!isDoorOpen && (isCodeCorrect || !isFaceRecognized)){
        println("Welcome home!")
    }
    else println("Input correct password")
}