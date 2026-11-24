package oop.abstrInterface.draw

abstract class Shape{
    abstract fun draw()
}

class Circle: Shape(){
    override fun draw() {
       print("Drawing a circle")
    }
}

class Square: Shape(){
    override fun draw() {
        print("Drawing a square")
    }
}

fun main() {
    val figure = readln().trim().toString()
    if (figure == "circle"){
        val circle = Circle()
        circle.draw()
    }
    else{
        val square = Square()
        square.draw()
    }
}