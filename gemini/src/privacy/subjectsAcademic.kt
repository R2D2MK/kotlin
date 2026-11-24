class Teacher {
    // ✅ internal: видно везде в проекте, но не за его пределами
    internal var subject = ""

    fun setSubject(newSubject: String) {
        this.subject = newSubject  // Меняем internal поле
    }

    fun printSubject() {
        println("Subject: $subject")
    }
}

fun main() {
    // 1. Считываем количество учителей
    val countTeachers = readln().trim().toInt()
    // 2. Цикл по всем учителям
    repeat(countTeachers) {
        // 3. Считываем предмет
        val subject = readln().trim()
        if (subject.isEmpty()) {
            println("Subject: Unknown")
        } else {
            // 4. Создаём учителя
            val teacher = Teacher()
            // 5. Устанавливаем предмет
            teacher.setSubject(subject)
            // 6. Выводим
            teacher.printSubject()
        }
    }
}