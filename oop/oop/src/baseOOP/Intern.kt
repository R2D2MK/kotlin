package baseOOP

class Intern(
    name: String,
    id: Int,
    officeDays: Int,
    remoteDays: Int,
    lunches: Int = 0,
    uniform: Boolean = false,
    equipment: Boolean = false,
    var practiceCompleted: Boolean
): Worker(name, id, officeDays, remoteDays, lunches, uniform, equipment) {
    fun completedPractice() {
    practiceCompleted = true
        println("Студент $name успешно завершил практику")
    }

    override fun getLunches() {
        lunches = 0
    }

    override fun getUniform() {
        uniform = false
    }

    override fun getEquipment() {
        equipment = false
    }

    override fun printInfo() {
        super.printInfo()
        println("Дополнительная информация: студент-практикант")
    }
}