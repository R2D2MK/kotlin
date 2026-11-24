package less_3_2

import kotlin.random.Random

class Monster {
    val pawsCount: Int
    val eyesCount: Int
    val fangsCount: Int
    val clawsCount: Int
    val tentaclesCount: Int

    constructor(pawsCount: Int, eyesCount: Int, fangsCount: Int, clawsCount: Int, tentaclesCount: Int) {
        this.pawsCount = pawsCount
        this.eyesCount = eyesCount
        this.fangsCount = fangsCount
        this.clawsCount = clawsCount
        this.tentaclesCount = tentaclesCount
    }
    constructor(allValue: Int) : this(
        pawsCount = allValue, eyesCount = allValue,
        fangsCount = allValue, clawsCount = allValue, tentaclesCount = allValue
    )

    constructor() : this(pawsCount = Random.nextInt(1, 11),
        eyesCount = Random.nextInt(1, 11), fangsCount = Random.nextInt(1, 11),
        clawsCount = Random.nextInt(1, 11), tentaclesCount = Random.nextInt(1, 11))

    fun printInfo(){
        println("Кол-во лап: $pawsCount")
        println("Кол-во глаз: $eyesCount")
        println("Кол-во клыков: $fangsCount")
        println("Кол-во когтей: $clawsCount")
        println("Кол-во щупалец: $tentaclesCount")
    }
}
fun task(){
    val input = readln().split(" ")
    val paws = input[0].toInt()
    val eyes = input[1].toInt()
    val fangs = input[2].toInt()
    val claws = input[3].toInt()
    val tentacles = input[4].toInt()

    val myMonster = Monster(paws, eyes, fangs, claws, tentacles)
    myMonster.printInfo()
}

