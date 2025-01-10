package Example_4_8

class Student(
    name: String,
    surname: String,
    age: Int,
    val studentId: String,
) : Person(name, surname, age) {
    override fun doActivity(): String {
        return "Учится"
    }

    override fun getDescription(): String {
    return "Студент: ${fullName()}, возраст: $age, ID: $studentId."
    }
}