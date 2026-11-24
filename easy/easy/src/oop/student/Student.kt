package oop.student

class Student(
    val name: String,
    val age: Int
) {
    override fun toString(): String {
      return "Name: $name, Age: $age"
    }
}