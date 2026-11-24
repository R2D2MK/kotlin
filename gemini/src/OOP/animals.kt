package OOP

open class Animal {
    open fun sound() {
        println("Животное издаёт звук")
    }

    class Dog : Animal() {
        override fun sound() {
            println("Гав")
        }
    }

    class Cat : Animal() {
        override fun sound() {
            println("Мяу")
        }
    }

    class Bird : Animal() {
        override fun sound() {
            println("Чирик")
        }
    }
}
fun main() {
    val animal = readln()
        when (animal) {
            "Bird" -> Animal.Bird().sound()
            "Cat" -> Animal.Cat().sound()
            "Dog" -> Animal.Dog().sound()
        }

}
