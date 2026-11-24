package ifElse

fun main() {
    val a = readln().toInt()
    if(a<1000){
        if(a<100){
            if(a<10){
                if(a<0){ println("Число отрицательное.")  }
                else   { println("Число однозначное")     }
            }else      { println("Число двузначное")      }
        }else          { println("Число трёхзначное")     }
    }else              { println("Число четырёхзначное и более")  }

}
