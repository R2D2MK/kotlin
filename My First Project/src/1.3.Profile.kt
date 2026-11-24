// Точка входа
// _2_BasicSyntax.Collections.Nullable.main - главная функция, с которой начинается выполнение программы.
fun main() {


    //Значения в Kotlin работают как в математике
//    val x = 5  (У Вани 5 яблок)
//    val y = x + 7 (У Коли 5 + 7 яблок)
//    val sum = x + y (Всего у них 12 яблок)


    //  Создана константа inputName, хранящая строку-приглашение.
    val inputName = "Input your name: "

//    Функция print() выводит текст без перевода на новую строку — чтобы пользователь мог ввести имя сразу после приглашения.
    print(inputName)

//    readln() — функция, которая считывает строку из ввода от пользователя.
//    Введённое имя сохраняется в переменную name.

//    println(inputName + "Second part: " + inputName)
    val name = readln()
//    println("Name: " + name)

//    Аналогично предыдущему: запрашиваем данные у пользователя и сохраняем их в переменные.
    val inputYears = "Input your age: "
    print(inputYears)
//    Результат сохраняется в переменную age как строка.
    val age = readln()
    print("Input your gender: ")
    val gender = readln()
    print("Input your height: ")
    val height = readln()
    print("Input your weight: ")
    val weight = readln()

//     Вывод информации
//    Здесь происходит вывод всех введённых данных с использованием интерполяции строк ($variable)
    println("Your name : \"$name\" \nYour age : \$$age \nYour gender : $gender \nYour height : $height \nYour weight : $weight")
}