package oop.abstrInterface.student

class Student(val name: String, val age: Int ): Person() {
    override fun info() {
        println("Student: $name, Age: $age")
    }
}