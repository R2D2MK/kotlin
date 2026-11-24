package less_4_2_HW

class Config {

    // СЕТТЕР с проверкой диапазона: плохое значение → сброс на дефолт 30
    var timeout: Int = 30
        set(value) {
            if (value < 1 || value > 300) {
                println("Ошибка: Время ожидания должно быть в диапазоне от 1 до 300 секунд. Установлено значение по умолчанию.")
                field = 30                    // ← сброс на default (так требует условие)
            } else
                field = value                 // ← валидное → записываем
        }

    // СЕТТЕР: отрицательное → сброс на дефолт 3
    var maxRetries: Int = 3
        set(value) {
            if (value < 0) {
                println("Ошибка: Максимальное количество повторных попыток не может быть отрицательным. Установлено значение по умолчанию.")
                field = 3                     // ← сброс на default
            } else
                field = value
        }

    // СЕТТЕР: TRACE/FATAL запрещены → НЕ трогаем field, остаётся прежнее значение
    var loggingLevel = LogLevel.INFO
        set(value) {
            if (value == LogLevel.TRACE || value == LogLevel.FATAL) {
                println("Ошибка: Уровень $value недоступен.")
                // field не меняем → старое значение сохраняется (условие: "оставить предыдущее")
            } else field = value
        }

    // ВЫЧИСЛЯЕМОЕ свойство: нет хранения, get() считает заново при каждом обращении
    val isDebugMode: Boolean
        get() = loggingLevel == LogLevel.DEBUG    // сравнение само даёт Boolean, if не нужен

    val isProductionMode: Boolean
        get() = loggingLevel == LogLevel.ERROR

    // Печатает текущий снимок всех настроек
    fun printConfig() {
        println("Время ожидания: $timeout секунд")
        println("Максимальное количество повторных попыток: $maxRetries")
        println("Уровень логирования: $loggingLevel")
        println("Режим отладки: $isDebugMode")
        println("Режим продакшн: $isProductionMode")
    }
}

// enum — ОТДЕЛЬНЫЙ тип, поэтому вне класса Config
enum class LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    FATAL
}

fun main() {
    val config = Config()

    // --- Блок 1: валидные значения (тишина, ошибок нет) ---
    config.timeout = 60
    config.maxRetries = 5
    config.printConfig()

    // --- Блок 2: плохие значения (ждём сообщения + сброс на дефолт) ---
    config.timeout = 500          // вне диапазона → 30
    config.timeout = 0            // вне диапазона → 30
    config.maxRetries = -1        // отрицательное → 3
    config.printConfig()

    // --- Блок 3: запрет FATAL (останется WARN, не INFO!) ---
    config.loggingLevel = LogLevel.WARN
    config.loggingLevel = LogLevel.FATAL    // отказ → остаётся WARN
    config.printConfig()

    // --- Блок 4: вычисляемые свойства (метки помогают читать консоль) ---
    config.loggingLevel = LogLevel.DEBUG
    println("=== после DEBUG ===")
    config.printConfig()          // тут isDebugMode = true

    config.loggingLevel = LogLevel.ERROR
    println("=== после ERROR ===")
    config.printConfig()          // тут isProductionMode = true
}