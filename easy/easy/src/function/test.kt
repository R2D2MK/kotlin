package function

import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val s1 = scan.next()
    val s2 = scan.next()
    val b  = scan.nextBoolean()
    fun check (s1: String, s2: String, b: Boolean = false): Boolean {
        if (s1.equals(s2)) {
            return true
        }
        else {
            return false
        }
    }
    print(check(s1,s2,ignoreCase = b))
}