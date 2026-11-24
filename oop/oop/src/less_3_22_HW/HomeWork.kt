package less_3_22_HW

// Контракт "умею преобразовывать данные"
interface Transformable {
    fun transform(data: String): String   // ← без тела, реализуют наследники
}

// Абстрактная база для всех обработчиков (нельзя создать напрямую)
abstract class DataProcessor(val processorName: String) {
    fun process(data: String): String {   // ← общий метод для всех
        return "Обработчик: $processorName обработал данные"
    }
}

// Наследует класс + реализует интерфейс
class Encryptor : DataProcessor("Encryptor"), Transformable {
    override fun transform(data: String): String {
        return "$processorName преобразовал данные: encoded_$data"   // ← префикс encoded_
    }
}

// Наследует класс + реализует интерфейс
class Compressor : DataProcessor("Compressor"), Transformable {
    override fun transform(data: String): String {
        return "$processorName преобразовал данные: compressed_$data"   // ← префикс compressed_
    }
}

// Только наследник DataProcessor, БЕЗ интерфейса (преобразовывать не умеет)
class Logger : DataProcessor("Logger")