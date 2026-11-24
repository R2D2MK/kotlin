package baseOOP

fun main() {
    val code = readln()
    val result = StringBuilder()
    var step = 0

    while (step < code.length) {
        when {
            code[step] == '.' -> {
                result.append('0')
                step++
            }

            code[step] == '-' && code[step + 1] == '.' -> {
                result.append('1')
                step += 2
            }

            code[step] == '-' && code[step + 1] == '-' -> {
                result.append('2')
                step += 2
            }
        }


    }
    println(result)
}