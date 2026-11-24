package less_3_17_HW

data class Order(
    val id: Int,
    val status: String,
    val type: String
)

fun removeCompletedOrders(orders: List<Order>, typeToRemove: String): List<Order> {
    // Создаём копию, чтобы можно было удалять
    val result = orders.toMutableList()
    // Проходим по каждому заказу
    for (order in result.toList()) {
        if (order.status == "completed" && order.type == typeToRemove) {
            result.remove(order)
        }
    }
    // Возвращаем новый список
    return result
}

