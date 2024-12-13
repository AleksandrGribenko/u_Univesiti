package Example_4


fun main() {
//    Дан порядковый номер месяца года. Нужно написать программу, которая будет выводить на экран время года и название месяца.
//    Пример вывода: «Зима: Январь.»
    val month = 6
    when (month) {
        in 1..2, 12 -> {
            print("Зима: ")
            when (month) {
                1 -> println("Январь")
                2 -> println()
                12 -> println()
            }
        }

        in 3..5 -> {
            print("Весна: ")
            when (month) {
                3 -> println("Март")
                4 -> println("Апрель")
                5 -> println("Май")
            }
        }

        in 6..8 -> {
            print("Лето: ")
            when (month) {
                6 -> println("Июнь")
                7 -> println("Июль")
                8 -> println("Август")
            }
        }

        in 9..11 -> {
            print("Осень: ")
            when (month) {
                9 -> println("Сентябрь")
                10 -> println("Октябрь")
                11 -> println("Ноябрь")
            }
        }

    }
//Дана переменная с плавающей точкой. Написать программу, которая округляет эту переменную до целого числа.
    val b: Double = 12.543
    val c: Int
    var tmp: Int
    (b % 100).also { tmp = it.toInt() }
    ((b - tmp) * 100).also { c = it.toInt() }
    when (c) {
        in 0..50 -> println((b).also { tmp = it.toInt() })
        in 50..99 -> println((b + 1).also { tmp = it.toInt() })
    }

//Написать программу, которая определяет время суток.
// Допустим с 0 часов до 5 -"Раннее утро", с 6 до 11 – утро, с 12 до 17 - день, с 17 – 20 – вечер,
// после 20 до 23 – поздний вечер.
    val time: Int = 17
    when (time) {
        in 0..5 -> println("Раннее утро")
        in 6..11 -> println("утро")
        in 12..17 -> println("день")
        in 17..20 -> println("вечер")
        in 20..23 -> println("поздний вечер")
    }
//    Даны две переменные a = 8, b = 5. Написать алгоритм, при котором a = 5, b = 8.
    var aa = 8
    var bb = 5
    print(aa)
    print(" ")
    println(bb)
    var temp: Int
    temp = aa
    aa = bb
    bb = temp
    print(aa)
    print(" ")
    println(bb)
}