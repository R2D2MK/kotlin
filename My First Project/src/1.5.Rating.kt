fun main() {
    // Запрос оценки от пользователя
    println("Input your rating from 1 to 5: ")
    val rating = readln()  // Чтение введенной оценки

    // Запрос комментария от пользователя
    println("Add your comment: ")
    val comment = readln()  // Чтение введенного комментария

    // Вывод благодарности и собранных данных
    println("Thank you for your feedback! \nYour rating : $rating \nYour comment : $comment ")

}