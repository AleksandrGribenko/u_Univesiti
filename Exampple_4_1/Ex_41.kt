package Exampple_4_1

fun main() {
    println("Введите число и степень")
    var a: Int = readln().toInt()
    var b: Int = readln().toInt()
    myPow(a, b)

    do {
        println("Введите А и Б. А < Б")
        a = readln().toInt()
        b = readln().toInt()
    } while (a > b)

    myMult(a, b)

    println("Введите числа")
    a = readln().toInt()
    b = readln().toInt()
    myNOD(a, b)
}


//Написать функцию возведения числа a в степень n.
fun myPow(a: Int, b: Int) {
    var tmp: Int = 1
    for (i in 0 until b) {
        tmp *= a
    }
    println(tmp)
}

//Написать функцию, которая принимает два целых числа a и b (a<b). Она вычисляет произведение всех целых чисел от a до b включительно.
fun myMult(a: Int, b: Int) {
    var tmp: Int = a
    for (i in a + 1..b) {
        tmp *= i
    }
    println(tmp)
}

//Написать функцию, которая принимает два целых числа a и b. Результатом работы функции должен быть вычисленный наибольший общий делитель a и b.
fun myNOD(a: Int, b: Int) {
    var tmp: Int
    if (a < b) {
        tmp = a
    } else {
        tmp = b
    }
    for (i in tmp downTo 1) {
        if (a % i == 0 && b % i == 0) {
            tmp = i
            break
        }
    }
    println(tmp)
}