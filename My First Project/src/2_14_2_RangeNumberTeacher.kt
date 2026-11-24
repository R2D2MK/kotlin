fun main() {
    val numbers = 2 ..1000 step 2
    print("Enter a number: ")
    val number = readln().toInt()
    val result = number in numbers
    println(result)
}