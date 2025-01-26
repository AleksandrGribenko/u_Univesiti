package E_60.Example_63

fun main() {
    //Написать функцию print(), которая на вход может принимать различные типы.
// Вызвать эту функцию несколько раз, поместив аргументы разных типов.
    Print<String>("Alex")
    Print(2.5)
    Print(true)
    Print(10)

    //Создать класс параметризованный класс Person, у которого свойство номера телефона в конструкторе может передаваться по – разному, как в виде числа, так и в виде строки.
// Создать Два экземпляра Person, поле телефона заполнить у первого числами, у второго строкой. Вывести полученную информацию о них. Person: name = имя, phone = телефон
    val personOne = Person("Василий", +7912345678)
    val personTwo = Person("Ольга", "+7912398765")
    println("Person: name = ${personOne.name}, phone = ${personOne.phone}")
    println("Person: name = ${personTwo.name}, phone = ${personTwo.phone}")

//Написать функцию вывода в консоль переменных разных типов данных.
// Вторым параметром в функции будет тип Char и будет представлять то, во что будет оборачиваться переменная параметризованного типа, поступающая на вход в качестве первого параметра.
// Например, переменная Int должна оборачиваться в фигурные скобки.
    val a: Int = 10                         //      -> {10}
    val b: String = "Hello"                 //      -> [Hello]
    val c: List<Int> = listOf(10, 16, 3)    //      -> "[10, 16, 3]"
    val d = 'f'                             //      -> (f)

    adidasPrinter(a)
    adidasPrinter(b)
    adidasPrinter(c)
    adidasPrinter(d)

}

fun <T> adidasPrinter(volume: T) {
    when (volume) {
        is Int -> println("{$volume}")
        is String -> println("[$volume]")
        is List<*> -> println("\"$volume\"")
        is Char -> print("($volume)")
    }
}


fun <T> Print(a: T) {
    println(a)
}

class Person<T>(val name: String, val phone: T)