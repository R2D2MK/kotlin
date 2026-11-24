package less_3_15.files

import java.io.File

fun main() {
    val file = File("test.txt")
    file.appendText("Hello World")
}