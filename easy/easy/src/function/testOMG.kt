package function

fun check(s1: String, s2: String, ignoreCase: Boolean = false) :Boolean =
    s1.isNotEmpty() && s2.isNotEmpty() &&
            if (ignoreCase) {
                s1[0].uppercaseChar() == s2[0].uppercaseChar()
            } else {
                s1[0] == s2[0]
            }


