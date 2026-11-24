fun main() {
    // Запрашиваем у пользователя, сколько у него денег
    // Используем параметр `message` для ясности (хотя можно просто print("..."))
    print(message = "How much money do you have in your pocket?: ")
    val money = readln().toInt() // Преобразуем строку в целое число (Int)

    // Уточняем, голоден ли пользователь
    print("Are you hungry? true/false: ")
    val hunger = readln().toBoolean() // Ожидаем "true" или "false"

    // Принимаем решение на основе двух факторов: голод и количество денег

    if (hunger && money > 500) {
        // Если голоден И денег больше 500 — покупаем пиццу
        println("Buy PIZZA")
    } else if (hunger && money < 500) {
        // Если голоден, но денег меньше 500 — берём дешёвый перекус (доджирок)
        println("Buy doshirak")
    } else if (!hunger && money > 500) {
        // Если не голоден, но денег достаточно — идём в кино (развлечься)
        println("Go to the cinema")
    } else if (!hunger && money < 500) {
        // Если не голоден и мало денег — просто гуляем (экономим)
        println("Go to walk")
    }
    // Примечание: случай, когда money == 500, не обрабатывается — ни одно условие не сработает
}