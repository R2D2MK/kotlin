package less_3_23_HW

import java.text.SimpleDateFormat
import java.util.Date

// Событие лога: хранит данные ЛЮБОГО типа + время создания
class LogEvent(val eventData: Any) {   // val Any → принимает строку, число, enum — что угодно

    // date фиксируется ОДИН раз при создании объекта (свойство, не в конструкторе)
    private val date: String = getCurrentDate()

    // helper: текущие дата и время в нужном формате
    private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return dateFormat.format(Date())
    }

    // [дата]: данные — $eventData сам вызовет toString() своего типа
    override fun toString(): String {
        return "[$date]: $eventData"
    }
}

// Список действий пользователя
enum class UserAction {
    LOGIN,
    LOGOUT,
    CLICK_BUTTON,
    VIEW_PAGE;   // ← ; обязателен перед методами в enum

    // печатаем "UserAction: LOGIN" вместо просто "LOGIN"
    override fun toString(): String {
        return "UserAction: $name"   // name = имя текущего значения enum
    }
}

fun main() {
    val log1 = LogEvent("User logged in")        // данные — строка
    val log2 = LogEvent(404)                      // данные — число
    val log3 = LogEvent(UserAction.CLICK_BUTTON)  // данные — enum

    println(log1)   // [дата]: User logged in
    println(log2)   // [дата]: 404
    println(log3)   // [дата]: UserAction: CLICK_BUTTON  ← тут сработал toString() енама
}