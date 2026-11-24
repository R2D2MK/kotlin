class Safe {
    private var secretCode: String = "1234"
    private var money: Int = 1000
    fun withdraw(code: String, amount: Int) {
        if (secretCode == code) {
            money -= amount
            println("Деньги выданы")
        } else println("Неверный код")
    }
}

open class Gadget {
    protected var internalMemory: Int = 64
}
class Smartphone : Gadget() {
    fun upgradeMemory() {
        internalMemory *= 2
    }
}

class PlayerProfile {
    var score: Int = 0
        private set
    fun winLevel(){
        score += 100
    }
}

fun main() {
    val mk: PlayerProfile = PlayerProfile()
    mk.winLevel()
//    mk.score = 500 компилятор остановил красной ошибкой
}

