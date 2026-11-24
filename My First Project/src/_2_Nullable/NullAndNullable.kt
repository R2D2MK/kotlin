package _2_Nullable

fun main(){
    val stringOne: String? = null
    val stringTwo: String? = "test"
    val stringThree: String? = ""

    val result = (stringOne?.length?:0) + (stringTwo?.length?:0) + (stringThree?.length?:0)
    println(result)
}