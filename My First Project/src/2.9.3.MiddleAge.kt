fun main() {
    print("Input age of the first person: ")
    val firstMan = readln().toInt()
    print("Input age of the second person: ")
    val secondMan = readln().toInt()
    print("Input age of the third person: ")
    val thirdMan = readln().toInt()
    val average = (firstMan + secondMan + thirdMan) / 3.0
    println("Average age: $average")
}