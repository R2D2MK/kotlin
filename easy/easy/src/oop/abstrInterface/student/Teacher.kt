package oop.abstrInterface.student

class Teacher(val name: String, val subject: String): Person() {
    override fun info() {
        println("Teacher: $name, Subject: $subject")
    }
}