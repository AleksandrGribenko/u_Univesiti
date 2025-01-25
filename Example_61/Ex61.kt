package E_60.Example_61

fun main() {
// Напишите функцию, которая запускает лямбду print() столько раз сколько будет указано в параметре count.Например, чтобы передаваемое сообщение в print() выводилось count раз.

    val count = { a: Int ->
        var tmp = a
        while (tmp != 0) {
            println("Hello Word!")
            tmp--
        }
    }
    count(5)

    // Напишите программу, реализующую лямбда-выражение для вычисления среднего арифметического списка чисел.

    val numbers = arrayOf(1, 2, 3, 4)

    val average: (Array<Int>) -> Double = { nums ->
        nums.sum().toDouble() / nums.size

    }
    println(average(numbers))


    //b Дан массив произвольного набора чисел. Отфильтруйте его, чтобы в нем остались только положительные числа.
    val arr = arrayOf(-3, -2, -1, 0, 1, 2, 3)
    val positive: (Array<Int>) -> List<Int> = { numbers ->
        numbers.filter { it >= 0 }
    }
    println(positive(arr))
}