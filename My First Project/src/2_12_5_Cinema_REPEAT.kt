fun main() {
    print("Enter your age: ")
    val age = readln().toInt()

    repeat(18 - age) {
        println("You are too young")
    }
    println("You can go to the cinema!!!")
}
