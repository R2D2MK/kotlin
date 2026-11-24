fun main() {
    print("Enter your age: ")
    var age = readln().toInt()

    while (age < 18) {
        println("You are too young")
        age++
    }
    println("You can go to the cinema!!!")
}