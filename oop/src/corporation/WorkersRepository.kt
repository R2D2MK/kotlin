package corporation

import java.io.File

object WorkersRepository {

    private val fileEmployees = File("employee_cards.txt")
    private val _workers = loadAllEmployees()
    val workers
        get() = _workers.toList()

    fun registerNewEmployee(newWorker: Worker) {
//        for (worker in _workers) {
//            if (worker == newWorker) {
//                return
//            }
//        }
        _workers.add(newWorker)
    }

    fun findAssistant(): Assistant? {
        for (worker in _workers) {
            if (worker is Assistant) {
                return worker
            }
        }
        return null
    }

    fun findDirector(): Director? {
        for (worker in _workers) {
            if (worker is Director) {
                return worker
            }
        }
        return null
    }

    fun saveChanges() {
        val content = StringBuilder()
        for (worker in _workers) {
            val workerAsText = "${worker.id}%${worker.name}%${worker.age}%${worker.salary}%${worker.position}\n"
            content.append(workerAsText)
        }
        fileEmployees.writeText(content.toString())
    }


    fun changeSalary(id: Int, salary: Int) {
        for (worker in _workers) {
            if (worker.id == id) {
                val newWorker = worker.copy(salary = salary)
                _workers.remove(worker)
                _workers.add(newWorker)
                break
            }
        }
    }
    fun changeAge(id: Int, age: Int) {
        for (worker in _workers) {
            if (worker.id == id) {
                val newWorker = worker.copy(age = age)
                _workers.remove(worker)
                _workers.add(newWorker)
                break
            }
        }
    }


    fun fireEmployee(id: Int) {
        for (worker in _workers) {
            if (worker.id == id) {
                _workers.remove(worker)
                break
            }

        }
    }

    private fun loadAllEmployees(): MutableSet<Worker> {
        println("Loading all employees")   // лог: вызвалось 1 раз
        val employees = mutableSetOf<Worker>()
        if (!fileEmployees.exists()) fileEmployees.createNewFile()
        val content = fileEmployees.readText().trim()

        if (content.isEmpty()) {
            return employees
        }

        val employeesAsString = content.lines()

        for (employeeString in employeesAsString) {
            val properties = employeeString.split("%")
            val id = properties[0].toInt()
            val name = properties[1]
            val age = properties[2].toInt()
            val salary = properties[3].toInt()
            val positionAsText = properties.last().trim()
            val position = Position.valueOf(positionAsText)
            val worker = when (position) {
                Position.DIRECTOR -> Director(id, name, age, salary)
                Position.ACCOUNTANT -> Accountant(id, name, age, salary)
                Position.ASSISTANT -> Assistant(id, name, age, salary)
                Position.CONSULTANT -> Consultant(id, name, age, salary)
            }
            employees.add(worker as Worker)
        }
        return employees
    }


}