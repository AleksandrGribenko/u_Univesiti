package Example_4_8

class Employee(
    name:String,
    surname:String,
    age:Int,
    val position:String
):Person(name,surname,age) {
    override fun doActivity(): String {
        return "Работает"
    }

    override fun getDescription(): String {
        return "Сотрудник: ${fullName()}, возраст: $age, Должность: $position."
    }
}