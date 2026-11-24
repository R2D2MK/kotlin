package less_3_2

class User(
    val id: Int,
    val name: String,
    val lastName: String,
    val email: String = "userName@mail.net",
    val phoneNumber: String = "userPhone",
) {
}