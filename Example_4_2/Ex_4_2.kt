package Example_4_2

fun main() {
    var arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(myFun(1, 5, 2, 6, 3, 7, 4, 8, 5, 9))
    println(myFun(1, 2, 3, 4, 5, 6, 7, 8, 9))

    println(arr.contentToString())
    val numbers = intArrayOf(-5, 3, -1, 7, -2)
    println(numbers.joinToString(" "))
    val number2 = evenCheck(numbers)

    println((number2.joinToString(" ")))

    val m = readln().toInt()
    val n = readln().toInt()
    val matrix = Array(m) { IntArray(n) }
    for (i in 0 until m) {
        for (j in 0 until n) {
            matrix[i][j] = (0..9).random() // Заполняем случайными числами
        }
    }
    val k= readln().toInt()
    println("Элементы $k-й строки: ${matrix[k].joinToString(", ")}")
}
//Написать функцию, на вход которой поступает массив из произвольного количества элементов.
// Данная функция проверяет, если в массиве локальные минимумы и возвращает число локальных минимумов.
// (локальный минимум – это когда два соседних элемента больше того, что между ними, например, 5,2,7).

fun myFun(vararg mas: Int): Int {
    var result = 0
    for (i in 1..mas.size - 1) {
        if (mas[i] < mas[i - 1] && mas[i] < mas[i + 1]) {
            result++
        }
    }
    return result
}

//Напишите функцию, в которой проверяется созданный Вами массив целых чисел.
// Если в нем имеются отрицательные элементы, то необходимо увеличить этот элемент на единицу и вернуть массив.
fun evenCheck(mas: IntArray): IntArray {

    for (i in mas.indices) {
        if (mas[i] < 0) {
            mas[i] += 1
        }
    }
    return mas
}
//Дана матрица размера M×N и целое число K (1≤K≤M). Вывести элементы K-й строки данной матрицы.
