package corporation

data class Assistant(
    override val id: Int,
    override val name: String,
    override val age: Int = 0,
    override val salary: Int = 0,
) : Worker(
    id,
    name,
    age,
    salary = salary,
    position = Position.ASSISTANT
), Cleaner, Supplier {

    override fun clean() {
        println("My position is ${position.title}. I'm cleaning workplace...")
    }

    override fun copy(
        id: Int,
        name: String,
        age: Int,
        salary: Int,
        position: Position
    ): Worker {
        return copy(id = id, name = name, age = age, salary = salary)
    }

    override fun buyThings() {
        println("My position is ${position.title}.I'm buying things!")
    }

    override fun work() {
        println("I'm answering the phone now...")
    }

    fun bringCoffee(drinkName: String = "Cappuccino", count: Int = 1): String {
        repeat(count) {
            println("Get up")
            println("Go to the coffee machine")
            println("press the \"$drinkName\" button")
            println("wait to the \"$drinkName\" to be prepared")
            println("Take coffee")
            println("Bring coffee your BOSS")
            println("Put coffee on the table")
            println("Return to the workplace")
        }
        return "Espresso"
    }


}