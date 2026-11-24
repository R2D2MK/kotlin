package gui

class Rectangle(
    var height: Int = 1,
    var width: Int = 1
) {
    val area
        get() = height * width



    constructor(size: Int) : this(size, size)

    fun draw() {
        repeat(height) {
            repeat(width) {
                print("* ")
            }
            println()
        }
    }
}
