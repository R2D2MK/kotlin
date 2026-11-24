import baseOOP.Intern
import baseOOP.Worker

fun main() {
    val worker = Worker("Maxim", 1, 3,2)
    val worker2 = Worker("David", 2, 0,5)
    val worker3 = Worker("Renat", 3, 5,0)

    val intern = Intern("Pavel", 1, 5, 0, practiceCompleted = false)
    val intern2 = Intern("Ivan", 2, 5, 0, practiceCompleted = false)


    worker.printInfo()
    worker2.printInfo()
    worker3.printInfo()

    intern.printInfo()
    intern2.printInfo()


    intern.completedPractice()

}