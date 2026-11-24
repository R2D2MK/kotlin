package _2_Nullable

fun main(){
    // Присвоение переменной result значение типа nullable, если введено "null"
    var result = readLine()
    if(result == "null"){
        result = null
    }
    println(result?.length ?: 0)


    }