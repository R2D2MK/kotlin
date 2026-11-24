package oop.student

fun main() {
    val allStudents = mutableListOf<Student>()
    val countStudent = readln().toInt()

    repeat(countStudent) {
        val line = readln()
        val parts = line.split(" ")
        val name = parts[0]
        val age = parts[1].toInt()
        val student = Student(name, age)
        allStudents.add(student)
    }

    for (student in allStudents){
        println(student)
    }



}