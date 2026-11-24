package setMap

fun main() {
    val dictionary = mutableMapOf(
        "house" to "дом",
        "cat" to "кот",
        "dog" to "собака"
    )

    dictionary["cat"] = "КОШКА"
    dictionary["car"] = "автомобиль"


    println(dictionary["dog"])
    println(dictionary["dog1"])
    println(dictionary.getOrDefault("cat1", "нет в словаре"))
    // безопасный вызов

    val age = mapOf(
        "Ivan" to 30,
        "Maria" to 40
    )
    println(age.getOrDefault("Ivan", "noname"))
    println(dictionary["cat"])
    println(dictionary["car"])

    dictionary.remove("car")
    println(dictionary["car"])
    println()

    for (item in dictionary){
        println(item.key)
        println(item.value)
    }

}