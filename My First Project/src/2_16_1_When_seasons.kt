fun main() {
    val month = readln()
    val season = when (month) {
        "December", "January", "February" -> "Winter"
        "March", "April", "May" -> "Spring"
        "June", "July", "August" -> "Summer"
        "September", "October","November" -> "Autumn"
        else -> { " " }
    }
    when (month) {
        "December","January", "February","March", "April", "May",
        "June", "July", "August", "September", "October","November" ->
            println("You entered month $month, this is $season")
        else -> {
            println("You entered bad month, $month - this is not season")
        }
    }

}