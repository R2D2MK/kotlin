fun main() {
    val names = listOf("John", "Mike", "Nick", "Helen", "Alex", "Emma", "Jack")
    print("Enter name: ")
    val searchName = readln()
    var nameFound = false

    for (name in names) {
        println(" $name ")
        if (searchName == name) {
            nameFound = true
            break
        }
    }
    println("Name found: $nameFound")
}