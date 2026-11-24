fun main() {
    // Пользователь вводит текущую температуру в градусах Цельсия
    var temperature = readln().toInt()

    // Переменная, отслеживающая состояние кондиционера:
    // false — выключен, true — включён
    var airConditionerIsOn = false

    // --- ПЕРВЫЙ ЦИКЛ РЕГУЛИРОВАНИЯ ТЕМПЕРАТУРЫ ---

    // Проверяем, нужно ли включить кондиционер на основе начальной температуры
    if (temperature > 25) {
        // Если температура выше 25°C — включаем кондиционер
        airConditionerIsOn = true
    } else if (temperature < 20) {
        // Если температура ниже 20°C — выключаем кондиционер
        airConditionerIsOn = false
        // Примечание: если температура в диапазоне [20; 25], состояние не меняется (остаётся false)
    }

    // Теперь применяем работу кондиционера к температуре
    if (airConditionerIsOn) {
        // Если кондиционер включён — он охлаждает воздух на 5 градусов
        temperature -= 5
    } else {
        // Если кондиционер выключен — температура растёт (например, от внешней среды)
        temperature += 5
    }

    // Выводим текущую температуру после первого шага
    println("Current temperature: $temperature")

    // --- ВТОРОЙ ЦИКЛ РЕГУЛИРОВАНИЯ ТЕМПЕРАТУРЫ ---

    // Снова проверяем, нужно ли изменить состояние кондиционера,
    // уже на основе обновлённой температуры
    if (temperature > 25) {
        airConditionerIsOn = true
    } else if (temperature < 20) {
        airConditionerIsOn = false
    }

    // Снова применяем эффект кондиционера
    if (airConditionerIsOn) {
        temperature -= 5
    } else {
        temperature += 5
    }

    // Выводим финальную температуру после второго шага
    println("Current temperature: $temperature")
}