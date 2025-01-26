package E_60.Example_62

fun main() {
    //Дана строка «Занятие». Вывести на экран символы, составляющие данную строку.
    val stroke = "Занятие"
    stroke.forEach { element -> println(element) }

//Нужно осуществить проверку номера телефона. Он должен начинаться с +7 и содержать 10 цифр, не считая +7.
// Если телефон верно введен, выведите true, иначе false.
    val phoneNumber = readln()
    if (phoneNumber.take(2) == "+7") {
        println(phoneNumber.length == 12)
    } else println(false)

    //Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке.
    val strokeTwo="Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке"
    println(strokeTwo.reversed())


    //Дана строка «kotlin2023course». Подсчитать количество содержащихся в ней цифр.
    val kotlin="kotlin2023course"
    val strNum=kotlin.filter { it.isDigit() }
    println(strNum.length)
}