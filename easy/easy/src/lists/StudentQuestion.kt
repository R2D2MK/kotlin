package lists

fun main() {
    for (i in 0..2)
        println("Student $i - question № ${(0..10).random()}")

    val studentName = listOf("Maxim", "Tanya", "David", "Renat", "Nikita", "Simba")
    val studentNameDayTwo = mutableListOf<String>()

    println("Print students names:")
    while (true) {
        val studentName = readln()
        if (studentName == "stop" || studentName == " " ) {
            break
        } else {
            studentNameDayTwo.add(studentName)
        }
    }
        val question = listOf(
            "1. What function creates an immutable list in Kotlin?", //1. Какая функция создаёт неизменяемый список в Kotlin?",
            "2. How do you create an empty list using 'listOf'?", //2. Как создать пустой список с помощью listOf?
            "3. Can you add elements to a list created with 'listOf'?", //3. Можно ли добавлять элементы в список, созданный с помощью listOf?
            "4. What happens if you try to access an index that doesn't exist in a 'listOf'?", //4. Что произойдёт, если попытаться обратиться к индексу, которого нет в listOf?
            "5. How do you get the number of elements in a list?", //5. Как получить количество элементов в списке?
            "6. What is the type of a list created by listOf(\"apple\", \"banana\")?", //6. Каков тип списка, созданного функцией listOf("apple", "banana")?
            "7. How do you get the first element of a list?", //7. Как получить первый элемент списка?
            "8. How do you check if a list has no elements?", //8. Как проверить, нет ли в списке элементов?
            "9. How do you reverse the order of elements in a list?", //9. Как изменить порядок элементов в списке на обратный?
            "10. Can a 'listOf' contain elements of different types? (e.g., numbers and strings)" //10. Может ли listOf содержать элементы разных типов? (например, числа и строки)"
        )
        for (i in studentNameDayTwo)
            println("Student $i - Question № ${question.random()}")
    }