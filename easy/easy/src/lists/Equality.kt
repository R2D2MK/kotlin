package lists

fun main() {
    val input = readln().toInt()

    val list = mutableListOf<String>()

    repeat(input) {
        list.add(readln())
    }

        val first = list[0]

    for (element in list){
        if (element != first){
            println(false)
            return
        }
    }
    println(true)
}
