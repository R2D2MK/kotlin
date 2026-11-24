package less_3_14_HW

enum class DaysOfWeek(val title: String) {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье")
}

fun main() {
    val week = DaysOfWeek.entries
    for ((index, day) in week.withIndex()) {
        println("${index+1} - ${day.title}")
    }
}