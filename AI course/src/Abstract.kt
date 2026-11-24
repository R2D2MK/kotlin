abstract class PaymentGateway(
    val merchantId: String,
    val currency: String = "RUB"
) {
    // Конкретное свойство со значением
    val isTestMode: Boolean = false

    // Абстрактное свойство: наследник обязан дать ему значение
    abstract val gatewayName: String

    // Абстрактный метод: тела нет, наследник обязан написать логику
    abstract fun processPayment(amount: Double): Boolean

    // Конкретный метод: общая логика для всех платёжных систем
    fun printReceipt(amount: Double) {
        println("[$gatewayName] Чек на сумму $amount $currency сформирован.")
    }
}
class CardPaymentGateway(
    merchantId: String,
    val commissionPercent: Double
) : PaymentGateway(merchantId) {

    override val gatewayName: String = "Банковская карта (Интернет-эквайринг)"

    override fun processPayment(amount: Double): Boolean {
        val totalWithFee = amount + (amount * commissionPercent / 100.0)
        println("Списание $totalWithFee $currency через процессинг карт...")
        return true
    }
}

fun main() {
    val cardProcessor: PaymentGateway = CardPaymentGateway(
        merchantId = "SHOP_771",
        commissionPercent = 1.5
    )

    cardProcessor.processPayment(2500.0)
    cardProcessor.printReceipt(2500.0)
}