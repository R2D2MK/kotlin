package corporation

data class Director(
    override val id: Int,
    override val name: String,
    override val age: Int = 0,
    override val salary: Int = 0,

    ) : Worker(
    id = id,
    name = name,
    age = age,
    salary = salary,
    position = Position.DIRECTOR
), Supplier {
    fun takeCoffee(assistant: Assistant) {
        val drinkName: String = assistant.bringCoffee()
        println("Thank you, ${assistant.name}! The $drinkName is very testy")
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

    fun getConsultantToWork(consultant: Consultant) {
        val countServedClients = consultant.serveCustomers()
        println("Consultant ${consultant.name} served $countServedClients clients")
    }

    override fun buyThings() {
        println("My position is ${position.title}.I'm buying things!")
    }

    override fun work() {
        println("I'm drinking coffee...")
    }
}