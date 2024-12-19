package Example_9

fun main() {
    //Найти минимальный элемент в целочисленном массиве размера 3 х 3.
    val matrix = arrayOf(
        arrayOf(4, 6, 1),
        arrayOf(4, 7, 9),
        arrayOf(3, 8, 12)
    )
    var tmp = matrix[0][0]
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (tmp > matrix[i][j]) {
                tmp = matrix[i][j]
            }
        }
    }
    println("минимальный элемент : $tmp")

// Создать матрицу размером 3 х 5. Найти элемент в этом массиве, который является средним(медиана)
    val matrix2 = arrayOf(
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(11, 12, 13, 14, 15),
    )
    println(matrix2[matrix2.size / 2][matrix2[matrix2.size / 2].size / 2])
    println()
    //Дана матрица размером 5 х 5. Заполнить ее единицами в таком   порядке:
    //0 0 0 0 0
    //0 0 0 0 0
    //0 0 1 0 0
    //0 1 1 1 0
    //1 1 1 1 1
    val matrix3 = Array(5) { IntArray(5) { 0 } }
//    println(matrix2.contentDeepToString())
//    println(matrix3.contentDeepToString())
    for (i in matrix3.indices) {
        tmp = matrix3.size - 1
        for (j in matrix3[i].indices) {
            if (i >= j && i + j >= tmp) matrix3[i][j] = 1
            print("${matrix3[i][j]} ")
        }
        println()
    }
    println()
// Дан набор целых чисел. Найти второе максимальное число.
    //val const X = 2
    val numbers = arrayOf(5, 6, 7, 8, 9, 8, 7, 4, 5, 6, 3, 2, 1, 9, 5, 4, 5, 6, 7, 8, 9)
    //var secondIndex: Int
    var indtmp = 0
    for (i in numbers.indices) {

        if (numbers[indtmp] < numbers[i]) {
            indtmp = i

        }
    }
    for (i in indtmp + 1..numbers.size) {

        if (numbers[indtmp] == numbers[i]) {
            indtmp = i
            break
        }
    }
    println("второе максимальное число: index $indtmp  number ${numbers[indtmp]}")
}
