package less_4_2_HW

import kotlin.math.PI

/*
 * ============================================================
 *  ТРЕНИРОВКА 4.1–4.2 — Геттеры и сеттеры
 *  Заполни все TODO. Запусти main() — вывод должен совпасть
 *  с ожидаемым (указан в комментариях рядом).
 *  Хоткеи: Ctrl+O — переопределить, expression body через Alt+Enter.
 * ============================================================
 */

/* ------------------------------------------------------------
 * ЗАДАНИЕ 1 (база): кастомный СЕТТЕР с валидацией
 * ------------------------------------------------------------
 * Навык: проверка значения перед записью в field.
 *
 * Класс Thermostat (термостат):
 *  • temperature (Int), по умолчанию 20
 *  • Сеттер: допустимый диапазон 15..30.
 *      - если значение в диапазоне → установить
 *      - если вне диапазона → НЕ менять (оставить прежнее)
 *        и вывести "Температура вне диапазона 15-30"
 */

class Thermostat {
    var temperature: Int = 20
        set(value) {
            if (value in 15..30) {
                field = value
            } else println("Температура вне диапазона 15-30")
        }
}

/* ------------------------------------------------------------
 * ЗАДАНИЕ 2 (вычисляемое свойство): get() по другим полям
 * ------------------------------------------------------------
 * Навык: свойство, которое пересчитывается при каждом обращении.
 *
 * Класс Circle (круг):
 *  • radius (Double) — в конструкторе, изменяемый (var)
 *  • area (Double) — вычисляемое: π * radius * radius
 *      (используй kotlin.math.PI)
 *  • circumference (Double) — вычисляемое: 2 * π * radius
 *
 * ВАЖНО: area и circumference НЕ хранят значение — только get().
 * Проверь: после изменения radius они должны давать новый результат.
 */

class Circle(var radius: Double) {
    val area: Double
        get() = PI * radius * radius
    val circumference: Double
        get() = 2 * PI * radius
}


/* ------------------------------------------------------------
 * ЗАДАНИЕ 3 (private set): читать снаружи, менять внутри
 * ------------------------------------------------------------
 * Навык: ограничить запись свойства только телом класса.
 *
 * Класс Counter (счётчик):
 *  • count (Int), по умолчанию 0, с private set
 *      (снаружи читать можно, присваивать — нельзя)
 *  • fun increment() — увеличивает count на 1
 *  • fun reset() — сбрасывает count в 0
 *
 * Проверь: counter.count читается, а counter.count = 5 НЕ компилируется.
 */

class Counter() {
    var count: Int = 0
        private set

    fun increment() {
        count++
    }

    fun reset() {
        count = 0
    }
}
/* ------------------------------------------------------------
 * ЗАДАНИЕ 4 (связка всего): сеттер + вычисляемое + private set
 * ------------------------------------------------------------
 * Навык: всё вместе в одном классе.
 *
 * Класс BankCard (банковская карта):
 *  • balance (Int), по умолчанию 0, с private set (менять только внутри)
 *  • Свойство limit (Int) в конструкторе, по умолчанию 1000
 *  • fun deposit(amount: Int):
 *      - если amount > 0 → увеличить balance
 *      - иначе → вывести "Сумма должна быть положительной"
 *  • fun withdraw(amount: Int):
 *      - если amount > balance → "Недостаточно средств"
 *      - иначе → уменьшить balance
 *  • Вычисляемое свойство isRich (Boolean):
 *      true, если balance >= limit
 */

class BankCard(var limit: Int = 1000) {
    var balance: Int = 0
        private set

    fun deposit(amount: Int) {
        if (amount > 0)
            balance += amount
        else println("Сумма должна быть положительной")
    }

    fun withdraw(amount: Int) {
        if (amount > balance)
            println("Недостаточно средств")
        else balance -= amount
    }

    val isRich: Boolean
        get() = balance >= limit

}

/* ------------------------------------------------------------
 *  ПРОВЕРКА. Раскомментируй блоки по мере выполнения.
 * ------------------------------------------------------------ */
fun main() {

    // ---- Задание 1 ----
    val thermostat = Thermostat()
    thermostat.temperature = 25
    println(thermostat.temperature)   // 25
    thermostat.temperature = 50       // Температура вне диапазона 15-30
    println(thermostat.temperature)   // 25 (осталось прежним)


    // ---- Задание 2 ----
    val circle = Circle(5.0)
    println(circle.area)              // ~78.53...
    circle.radius = 10.0
    println(circle.area)              // ~314.15...  (пересчиталось!)


    // ---- Задание 3 ----
    val counter = Counter()
    counter.increment()
    counter.increment()
    println(counter.count)            // 2
    counter.reset()
    println(counter.count)            // 0
//     counter.count = 5                 // <- эта строка НЕ должна компилироваться


    // ---- Задание 4 ----
     val card = BankCard(limit = 500)
     card.deposit(300)
     println(card.balance)             // 300
     println(card.isRich)              // false (300 < 500)
     card.deposit(200)
     println(card.isRich)              // true (500 >= 500)
     card.withdraw(1000)               // Недостаточно средств
     card.deposit(-50)                 // Сумма должна быть положительной
}