object GameManager {
    var currentScore: Int = 0

    fun addPoints(points: Int) {
        currentScore += points
        println(currentScore)
    }
}

class Player private constructor(
    val name: String,
    val isVip: Boolean
) {
    companion object {
        fun createNormal(name: String): Player {
            return Player(name, false)
        }

        fun createVip(name: String): Player {
            return Player(name, true)
        }

    }

}

interface ClickAction {
    fun execute()
}

fun main() {
    val myClick = object: ClickAction {
        override fun execute() {
            println("Клик обработан!")
        }
    }
    GameManager.addPoints(6)
    GameManager.addPoints(7)
    myClick.execute()
}
