package corporation

abstract class Worker(
    open val id: Int,
    open val name: String,
    open val age: Int = 0,
    open val salary: Int = 15000,
    val position: Position

) {
    //    Выполняется под капотом
//       get() {
//           return field
//       }
// Как бы это было реализовано в JAVA
//    fun setSalary(salary: Int) {
//        if (salary < this.salary) {
//            println("Is new salary is too small..")
//        }
//        this.salary = salary
//    }
//
//    fun getSalary(): Int {
//        return salary
//    }
//    override fun equals(other: Any?): Boolean {
//        if (other !is Worker) return false
//        return this.id == other.id && this.name == other.name && this.age == other.age && this.salary == other.salary
//    }
//
//    override fun toString(): String {
//        return "Id: $id Name: $name Age: $age Position: ${position.title} Salary: \"$salary\""
//    }
//
//    override fun hashCode(): Int {
//        var result = id
//        result = 31 * result + age
//        result = 31 * result + salary
//        result = 31 * result + name.hashCode()
//        result = 31 * result + position.hashCode()
//        return result
//    }
    abstract fun copy(
        id: Int = this.id,
        name: String = this.name,
        age: Int = this.age,
        salary: Int = this.salary,
        position: Position = this.position
    ): Worker

    abstract fun work()

    open fun printInfo() {
        println(this)
    }

}