package baseOOP

open class Worker(
    val name: String,
    val id: Int,
    val officeDays: Int,
    val remoteDays: Int,
    var lunches: Int = 0,
    var uniform: Boolean = false,
    var equipment: Boolean = false
) {
    init {
        fillData()
    }
    //Объединённые функции
    fun fillData() {
        getLunches()
        getUniform()
        getEquipment()
    }
    //Обеды за офисные дни
    open fun getLunches(){
       lunches = officeDays
    }

    //Форма, если ходит в офис и ещё не выдана
    open fun getUniform(){
        uniform = !uniform && officeDays > 0
    }

    //Оборудование - если работает в офисе и ещё не выдано
    open fun getEquipment() {
      equipment = !equipment && officeDays > 0
    }

    //Печать краткой информации
   open fun printInfo() {
        val workType = when {
            officeDays == 0 -> "Удалённый"
            remoteDays == 0 -> "офисный"
            else -> "гибридный"
        }
        println("\nСотрудник: $name (ID: $id)")
        println("Формат работы: $workType")
        println("Обеды: $lunches")
        println("Форма: ${if (uniform) "есть" else "нет"}")
        println("Оборудование: ${if (equipment) "есть" else "нет"}")

    }
}