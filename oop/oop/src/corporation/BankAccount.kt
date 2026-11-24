package corporation

open class BankAccount { // ← ПРИВАТНОЕ поле, видно только внутри класса
    private var balance: Int = 0 // ← PUBLIC метод — может вызвать кто угодно
    fun deposit(amount: Int) {
        if (amount >= 0) {
            balance += amount
        }
    }

    // ← PROTECTED метод — может вызвать только наследник
    protected fun withdraw(amount: Int) {
        // ←   1) Сумма положительная (amount > 0)
        // ←   2) На счёте хватает денег (amount <= balance)
        if (amount > 0 && amount <= balance) {
            // ← ВЫЧИТАЕМ из баланса
            balance -= amount
        }
    }

    fun getBalance(): Int {
        // ← Просто возвращаем текущий приватный баланс
        return balance
    }
}

// ← НАСЛЕДНИК: имеет доступ к protected методам родителя
class SpecialBankAccount : BankAccount() {
    // ← PUBLIC метод, который использует protected withdraw родителя
    fun specialWithdraw(amount: Int) {
        withdraw(amount)
    }
}