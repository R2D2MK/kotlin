package oop.abstrInterface.student

abstract class Person {
    abstract fun info()
}
fun main() {
    val input = readln().trim()
    if (input == "student"){
        val nameStudent = readln().trim().toString()
        val ageStudent = readln().trim().toIntOrNull() ?: 0
        val student = Student(nameStudent, ageStudent)
        student.info()
    }
    else {
        val nameTeacher = readln().trim().toString()
        val subjectTeacher = readln().trim().toString()
        val teacher = Teacher(nameTeacher, subjectTeacher)
        teacher.info()
    }
}


