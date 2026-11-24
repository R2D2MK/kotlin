package ifElse

fun main() {
        val a = readln().toDouble()
        val b = readln().toDouble()
        val c = readln().toDouble()

        val discriminant = b * b - 4 * a * c
        val sqrtD = Math.sqrt(discriminant)

           if (discriminant < 0) {
            // ничего не делаем
               return
        }
        else if (discriminant == 0.0) {
            val x = -b / (2 * a)
            println(x)
        }else if (discriminant > 0.0) {
            val x1 = (-b - sqrtD) / (2 * a)
            val x2 = (- b + sqrtD) / (2 * a)
            val minRoot = Math.min(x1, x2)
            val maxRoot = Math.max(x1, x2)
            println(minRoot)
            println(maxRoot)
        }
    }