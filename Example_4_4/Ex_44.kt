package Example_4_4

import Registration


fun main() {


    val unit: Registration
    unit = Registration()
    unit.setMail(readln())
    unit.setPass(readln())
    println(unit.getMail())

    var arr = initArray()
    printArray(arr)
    var array = initRandomArray()

    printPosArray(array)
}

fun printArray(arr: Array<IntArray>) {
    for (i in arr.indices) {
        for (j in arr.indices) {
            if (evenCheck(arr[i][j])) {
                print("row $i col $j value - ${arr[i][j]}\t")
            }
        }
        println()
    }
}

//Написать функцию заполнения двумерного массива 4 х 4 числами от 1 до 16 включительно.
fun initArray(): Array<IntArray> {
    val arr = Array(4) { IntArray(4) }
    var k = 1
    for (i in arr.indices) {
        for (j in arr.indices) {
            arr[i][j] = k++
        }
    }
    return arr
}


// Написать функцию поиска четных чисел двумерного массива размерностью 4 х 4.(Рабочий_Неправильный)
fun evenCheck(cheked: Int): Boolean {
    return cheked % 2 == 0
}

fun initRandomArray(): Array<IntArray> {
    val arr = Array(4) { IntArray(4) }
    var k = 1
    for (i in arr.indices) {
        for (j in arr.indices) {
            arr[i][j] = (-10..10).random()
        }
    }
    return arr
}

fun printPosArray(arr: Array<IntArray>) {
    for (i in arr.indices) {
        for (j in arr.indices) {
            if (checkPositive(arr[i][j])) {
                print("${arr[i][j]} | ")
            }else{
                print("  | ")
            }
        }
        println()
    }
}

fun checkPositive(cheked: Int): Boolean {
    return cheked >= 0
}

