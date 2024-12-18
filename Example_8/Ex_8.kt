package Example_8

import java.lang.Math.pow
import kotlin.math.roundToInt

fun main() {
//Создать массив из 10 чисел с плавающей точкой. Найти произведение его элементов.
    val array = arrayOf<Double>(1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.1, 10.5)
    var mult: Double = 1.0
    for (i in array) {
        mult *= i
    }
    println("%1.5f".format(mult))

    //Создать массив из 8 целых чисел. Найти среднее арифметическое его элементов.
    val array2 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val average = array2.average()
    println(average)

    //Дан массив размерностью size. Вывести в том же порядке все четные числа из данного набора и количество K таких чисел.
    val array3 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val columns = array3.size
    for (i in 0..columns) {
        if (i % 2 == 0) print("$i ")
    }
    println()

//Дано целое число N(>0).
// Сформировать и вывести целочисленный массив размера N, содержащий степени двойки от первой до N-й: 2,4,8,16,….
    println("Введите размер массива")
    var n = readln().toInt()
    val array4 = IntArray(n)
    for (index in 0..n - 1) {

        array4[index] = pow(2.0, index.toDouble()).toInt()
    }
    println(array4.contentToString())
}