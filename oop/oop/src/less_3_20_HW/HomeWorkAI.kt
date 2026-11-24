package less_3_20_HW

import kotlin.math.PI
import kotlin.math.round

/*
 * ============================================================
 *  ТРЕНИРОВКА 3.21 — Абстрактные классы
 *  Заполни все TODO. Запусти main() — вывод должен совпасть
 *  с ожидаемым (он указан в комментариях рядом с каждым println).
 *  Лайфхак: внутри класса нажми Ctrl+O чтобы сгенерировать override.
 * ============================================================
 */


/* ------------------------------------------------------------
 * ЗАДАНИЕ 1 (база): abstract class + abstract fun + override
 * ------------------------------------------------------------
 * Навык: создать абстрактный класс, который нельзя инстанцировать,
 * с абстрактным методом, который наследник ОБЯЗАН реализовать.
 *
 * Сделай:
 *  1. abstract class Animal(val name: String)
 *  2. abstract fun sound(): String   // без тела
 *  3. Два наследника: Dog и Cat. Каждый возвращает свой звук:
 *       Dog -> "Гав", Cat -> "Мяу"
 */

abstract class Animal(val name: String) {
    abstract fun sound(): String
}

class Dog(name: String) : Animal(name) {
    override fun sound(): String {
        return "Гав"
    }
}

class Cat(name: String) : Animal(name) {
    override fun sound(): String {
        return "Мяу"
    }
}

/* ------------------------------------------------------------
 * ЗАДАНИЕ 2 (средний): open-метод с телом + super + protected
 * ------------------------------------------------------------
 * Навык: почувствовать разницу abstract vs open.
 * Здесь у базового класса ЕСТЬ общая логика, поэтому метод open
 * (с телом), а наследник дополняет его через super.
 *
 * Сделай abstract class Notification(protected val recipient: String):
 *  1. abstract fun channel(): String        // "Email" / "SMS" — нет общей логики
 *  2. open fun send(message: String) {       // общая логика ЕСТЬ
 *         println("Отправляю через ${channel()} для $recipient: $message")
 *     }
 *  3. protected fun mask(text: String): String  // вспомогательный, скрывает половину строки
 *         // верни первые 3 символа + "***"   (например "Привет" -> "При***")
 *
 * Наследники:
 *  - EmailNotification: channel() = "Email".
 *  - SmsNotification: channel() = "SMS". Переопредели send() так, чтобы
 *    оно вызвало super.send(...), но message сначала прогнало через mask().
 */

abstract class Notification(protected val recipient: String) {
    abstract fun channel(): String        // "Email" / "SMS" — нет общей логики
    open fun send(message: String) {
        println("Отправляю через ${channel()} для $recipient: $message")
    }

    protected fun mask(text: String): String {
        return text.take(3) + "***"
    }
}

class EmailNotification(recipient: String) : Notification(recipient) {
    override fun channel(): String {
        return "Email"
    }
}

class SmsNotification(recipient: String) : Notification(recipient) {
    override fun channel(): String {
        return "SMS"
    }

    override fun send(message: String) {
        super.send(mask(message))
    }
}

/* ------------------------------------------------------------
 * ЗАДАНИЕ 3 (связка со вчерашним): инкапсуляция + абстракция
 * ------------------------------------------------------------
 * Навык: private поле (вчера) + abstract метод (сегодня) в одном классе.
 *
 * Сделай abstract class BankAccount(private var balance: Int):
 *  1. fun deposit(amount: Int)  — если amount > 0, увеличить balance
 *  2. fun getBalance(): Int      — вернуть balance
 *  3. abstract fun monthlyFee(): Int   — у каждого типа счёта своя комиссия
 *  4. fun applyMonthlyFee()  — вычесть monthlyFee() из balance (через приватное поле)
 *
 * Наследники:
 *  - BasicAccount: monthlyFee() = 100
 *  - PremiumAccount: monthlyFee() = 0
 */

abstract class BankAccount(private var balance: Int) {
    fun deposit(amount: Int) {
        if (amount > 0)
            balance += amount
    }

    fun getBalance(): Int {
        return balance
    }

    abstract fun monthlyFee(): Int

    fun applyMonthlyFee() {
        balance -= monthlyFee()
    }
}


class BasicAccount(balance: Int) : BankAccount(balance) {
    override fun monthlyFee(): Int = 100
}


class PremiumAccount(balance: Int): BankAccount(balance) {
    override fun monthlyFee(): Int = 0
}


/* ------------------------------------------------------------
 *  ПРОВЕРКА. Раскомментируй блоки по мере выполнения заданий.
 * ------------------------------------------------------------ */
fun main() {


     val animals: List<Animal> = listOf(Dog("Рекс"), Cat("Мурка"))
     for (a in animals) {
         println("${a.name} говорит: ${a.sound()}")
     }


     val email = EmailNotification("ivan@mail.ru")
     email.send("Привет")
     val sms = SmsNotification("+7900...")
     sms.send("Секрет")
//     Ожидается:
//     Отправляю через Email для ivan@mail.ru: Привет
//     Отправляю через SMS для +7900...: Сек***


    // ---- Задание 3 ----
     val basic = BasicAccount(1000)
     basic.deposit(500)
     basic.applyMonthlyFee()
     println("Basic баланс: ${basic.getBalance()}")     // 1400

     val premium = PremiumAccount(1000)
     premium.applyMonthlyFee()
     println("Premium баланс: ${premium.getBalance()}") // 1000
}
