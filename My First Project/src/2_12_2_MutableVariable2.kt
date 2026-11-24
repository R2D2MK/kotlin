fun main() {
    var temperature = readln().toInt()
    var airConditionerIsOn = false

// Дублирование кода благодаря - repeat
    repeat(times = 100) {
        if (temperature > 25) {
            airConditionerIsOn = true
        } else if (temperature < 20) {
            airConditionerIsOn = false
        }
        if (airConditionerIsOn) {
//            temperature -= 1
//            Вместо строчки выше используем декремент --
//            Декремент — это операция уменьшения значения переменной на 1
            temperature --
        } else {
//            Вместо строчки выше используем инкремент ++
//            Инкремент — это операция увеличения значения переменной на 1
            temperature ++
        }
        println("Current temperature: $temperature")
    }
}

