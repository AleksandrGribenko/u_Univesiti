package Example_4_8

abstract class Person(val name: String, val surname: String, val age: Int) {
    abstract fun doActivity(): String
    abstract fun getDescription(): String
//    fun fullName() {
//        println( "$name $surname")
//    }
     fun fullName():String{
        return "$name $surname"
    }
}