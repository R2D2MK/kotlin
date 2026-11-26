//Corporation.kt — ТОЧКА ВХОДА
//Создает сотрудников (включая Accountant)
//Запускает их работу
package corporation

import profile.Person

fun main() {
//    val assistant = WorkersRepository.findAssistant()
//    assistant?.printInfo()
//
//    val director = WorkersRepository.findDirector()
//    director?.printInfo()
//    if (assistant != null)
//        director?.takeCoffee(assistant)
//
//    val directorSalary = director?.salary ?: 0
//    val assistantSalary = assistant?.salary ?: 0
//    val sum = directorSalary + assistantSalary
    val director = Director(name = "Andrey", age = 25, salary = 60000, id = 0)
    val consultant = Consultant(name = "Max", age = 33, salary = 50000, id = 1)
    val assistant = Assistant(name = "Helen", age = 20, salary = 40000, id = 2)
    val accountant = Accountant(name = "Christian", age = 30, salary = 30000, id = 3)
    val employees = listOf(director, consultant, assistant, accountant)
    for (employee in employees) {
        employee.work()
    }

}
