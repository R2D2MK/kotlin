package arrays

/**
 * Программа для расчёта итоговой зарплаты сотрудников Технократии.
 *
 * Правила:
 * - Базовая зарплата указана для каждого сотрудника.
 * - Если у сотрудника есть достижения (true), он получает премию в размере 150% от зарплаты.
 * - Если достижений нет (false) — премия не начисляется.
 */
fun main() {
    // Список имён сотрудников
    val employees = arrayOf("Джейсон Тесла", "Алекс Вейланд", "Лекс Таргон", "Кайл Ренгар", "Майя Рейнольдс")

    // Базовая зарплата каждого сотрудника
    val salaryOfEmployees = arrayOf(1500.0, 10000.0, 5000.0, 5500.0, 5000.0)

    // Наличие достижений за месяц: true — есть, false — нет
    // Порядок соответствует списку сотрудников
    val achievementsOfEmployees = booleanArrayOf(true, false, false, true, true)

    // Обработка каждого сотрудника
    for (index in employees.indices) {
        // Рассчитываем премию: 150% от зарплаты, если есть достижения
        val employeeAward = if (achievementsOfEmployees[index]) {
            salaryOfEmployees[index] * 1.5
        } else {
            0.0
        }

        // Итоговая зарплата = базовая + премия
        val totalSalary = salaryOfEmployees[index] + employeeAward

        // Выводим результат в требуемом формате
        println("${employees[index]}, зарплата: $totalSalary")
    }
}