package corporation

import kotlin.random.Random

data class Consultant(
    override val id: Int,
    override val name: String,
    override val age: Int = 666,
    override val salary: Int = 0,
) : Worker(
    id = id,
    name = name,
    age = age,
    salary = salary,
    position = Position.CONSULTANT
), Cleaner {

    override fun clean() {
        println("My position is ${position.title}. I'm cleaning workplace...")
    }

    override fun work() {
        println("I'm servicing clients...")
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

    fun sayHello() {
        print("Hello, my name is $name ")
        if (age != 666)
            print("and my age is $age \n")
    }

    fun serveCustomers(): Int {
        val count = Random.nextInt(0, 100)
        repeat(count) {
            print("Client is service \n")
        }
        return count
    }

}