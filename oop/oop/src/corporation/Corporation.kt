//Corporation.kt — ТОЧКА ВХОДА
//Создает сотрудников (включая Accountant)
//Запускает их работу
package corporation

import profile.Person

fun main() {
    val assistant = WorkersRepository.findAssistant()
    assistant?.printInfo()

    val director = WorkersRepository.findDirector()
    director?.printInfo()
    if (assistant != null)
        director?.takeCoffee(assistant)

    val directorSalary = director?.salary ?: 0
    val assistantSalary = assistant?.salary ?: 0
    val sum = directorSalary + assistantSalary

}
