package _2_Nullable

fun main(){
    val nullableStr: String? = "Какой же длины это строка? Может вообще null?"
    val length = nullableStr?.length ?: 0
    println(length)
}