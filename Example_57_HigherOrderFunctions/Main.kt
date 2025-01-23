package E_50.Example_57_HigherOrderFunctions


fun main() {
// Написать функцию высшего порядка action, которая на вход принимает значения двух цветов типа String.
// Они будут смешиваться в функции, которая на вход поступает в качестве третьего аргумента в action, она же возвращает строку – получившейся цвет.
// Функция action возвращает результат в виде строки смешанный цвет из двух заданных.

    val colorOne = readln()
    val colorTwo = readln()
    println(action(colorOne, colorTwo, ::colorMix))

// Написать функции изменения числа: одна – увеличение числа на единицу, вторая – умножение на два.
// Написать функцию высшего порядка, которая на вход принимает массив целых чисел и вторым параметром функцию, принимающую число и возвращающая число.
// Функция высшего порядка будет возвращать измененный массив, который будет получаться за счет вызова внутри нее у этого массива функции map,
// внутри которой будет вызываться функция изменения числа.

    val arr = arrayOf(1, 2, 3, 4, 5)
    println(activity(arr) { sum(it) })
    println(activity(arr) { doubling(it) })

}

fun activity(arr: Array<Int>, op: (Int) -> Int): List<Int> {
    val result = arr.map { op(it) }
    return result
}

fun sum(num: Int):  Int {
    return num + 1
}

fun doubling(num: Int):Int{
    return num * 2
}

fun action(colorOne: String, colorTwo: String, colorMix: (String, String) -> String): String {  //
    return "$colorOne + $colorTwo"
}

fun colorMix(colorOne: String, colorTwo: String): String {
    return "$colorOne+$colorTwo"
}
