package E_50.Example_55_delegation

import java.lang.Math.pow

fun main() {
    //  Написать программу перевода числа из десятичной системы в двоичную систему счисления.

    println("введите число")
    val number = readln().toInt()
    println(transformToBinary(number))

    //  Написать программу перевода числа из двоичной системы в десятичную систему счисления.
    println(transformToDecimal(transformToBinary(number)))

    //Написать программу, которая проверяет, является ли слово палиндромом.
    println("проверяем, является ли слово палиндромом\nвведите число")
    val palindrome: Int = readln().toInt()
    println(checkPalindrome(palindrome))
}

fun checkPalindrome(number: Int): String {
    var tmp = number
    var n = 0
    while (tmp != 0) {
        tmp /= 10
        n++
    }
    val arr = Array(n) { 0 }
    tmp = number
    for (i in arr.indices) {
        arr[i] = tmp % 10
        tmp /= 10
    }
    for (i in arr.indices) {
        if (arr[i] != arr[n - 1]  ) {
            return "не является палиндромом"
        }
        n--
        if(i >= n) break
    }
    return "является палиндромом"
}

fun transformToDecimal(number: Int): Int {
    var tmp = number
    var result = 0
    var n = 0
    while (tmp != 0) {

        result += (tmp % 10 * pow(2.0, n.toDouble())).toInt()
        n++
        tmp /= 10
    }
    return result
}

fun transformToBinary(number: Int): Int {
    var tmp = number
    val arr = Array(10) { 0 }
    var result: Int = 0
    for (i in arr.indices) {
        arr[i] = tmp % 2
        tmp /= 2
        for (j in 0 until i) {
            arr[i] *= 10
        }
        result += arr[i]
        if (tmp == 0) break
    }
    return result
}