fun main() {
    val temperature = 22

    when (temperature){
        in 0..15 -> println("Надень куртку.")
        in 15..24 -> println("Отличная погода.")
        in 25..50 -> println("Идеально для пляжа!")
        else -> println("Погода не пригодна для выхода из дома")
    }
}