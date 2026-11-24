package less_4_12_HW

data class UserData(
    val name: String?,
    val email: String?,
    val age: Int?
)

interface Repository {
    fun getUsers(): List<UserData?>
}

class UserViewModel(private val repository: Repository) {
    fun getUserDescriptions(): List<String> {
        val users = repository.getUsers()        // получили данные
        val nonNullUsers = users.filterNotNull() // убрали null-элементы
        val result = mutableListOf<String>()     // корзина для результата
        for (user in nonNullUsers) {
            val name = if (user.name != null) user.name else "Unknown Name"   // дефолт для name
            val email = if (user.email != null) user.email else "Unknown Email" // дефолт для email
            val age = if (user.age != null) user.age else 0                   // дефолт для age
            result.add("Name: $name, Email: $email, Age: $age")               // собираем строку
        }
        return result                            // возвращаем список
    }
}