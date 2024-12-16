package Example_7


fun main() {
    //Дано целое число n (>0). Найти сумму 1+1/2+1/3+…+1/n (вещественное число).

    var n: Int
    do {
        println("целое число n (>0)")
        n = readln().toInt()
    } while (n < 0)

    var x: Double = 0.0
    println("сумма 1+1/2+1/3+…+1/n")
    for (i in 1..n) {
        x += 1 / i.toDouble()
    }
    println(x)
//Даны два целых числа a и b (a<b). Найти сумму квадратов всех целых чисел от a до b включительно.

    var a: Int
    var b: Int
    do {
        println("Введите два целых числа a и b (a<b)")
        a = readln().toInt()
        b = readln().toInt()
    } while (a > b)
    var sqr: Int = 0
    println("сумма квадратов всех целых чисел от a до b включительно")
    for (i in a..b) {
        sqr += (i * i)
    }
    println(sqr)
    println()
    //Даны целые числа A и B (A<B). Вывести все целые числа от A до B включительно;
// при этом число A должно выводиться 1 раз, число A+1 должно выводиться 2 раза и т. д. (допустим a = 3, b = 5 à 3,4,4,5,5,5)

    do {
        println("целые числа A и B (A<B)")
        a = readln().toInt()
        b = readln().toInt()
    } while (a > b)

    for (i in 0..b - a) {
        for (j in 0..i) {
            print(a + i)
        }
        println()
    }
    //Дано число n. Написать программу, которая проверяет, является ли оно простым.
    println("Дано число n. Написать программу, которая проверяет, является ли оно простым")
    n = readln().toInt()
    var f: Boolean = false
    if(n!=0){
        for (i in 2..n - 1) {
            if (n % i == 0) {
                f = true
                break
            }
        }
    }
    if (!f) println("Число простое")
    else println("Число не простое")
    /**
     * Есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?" Ответ: троллейбус.
     * Представим, что Вы загадываете эту загадку пользователю.
     * Создайте программу, которая будет считывать с консоли ответ.
     */
    println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
    for (i in 1..3) {
        val question = readln().toString()
        if (question == "тролейбус") {
            println("Правильно!")
            break
        } else if (question == "сдаюсь") {
            println("Правильный ответ: троллейбус.")
            break
        } else {
            if (i < 3) println("Подумай еще.")
            else println("Не угадал")
        }
    }
}