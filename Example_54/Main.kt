package E_50.Example_54



fun main() {
    //Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
    val stroke = arrayOf(
        "Дан",
        "массив",
        "строк",
        "Найти",
        "самое",
        "длинное",
        "слово",
        "в",
        "массиве",
        "и",
        "количество",
        "букв",
        "в",
        "этом",
        "слове"
    )
    println("самое длинное слово в массиве и количество букв в этом слове: [" + arrayStr(stroke)+"]")

    //Посчитать сумму элементов побочной диагонали матрицы 4х4.
    val arr = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(2, 3, 4, 5),
        arrayOf(3, 4, 5, 6),
        arrayOf(4, 5, 6, 7)
    )
    println("Сумма чисел побочной диагонали равна: ${sumArray(arr)}")

    val epson = IncJet("IncJet", "Epson-3212", 55, 45, 50, 30)
    println(epson.printerInfo())


    val hp = LaserJet("LaserJet", "HP-1234", 8)
    println(hp.printerInfo())


}


fun sumArray(arr: Array<Array<Int>>): Int {
    var sum: Int = 0
    for (i in arr.indices) {
        for (j in arr[i].indices) {
            if (i + j == arr.size - 1) {
                sum += arr[i][j]
            }
        }
    }
    return sum
}

fun arrayStr(str: Array<String>): String {
    var iLenMax = 0
    for (i in str.indices) {
        if (str[iLenMax].length < str[i].length) {
            iLenMax = i
        }
    }
    return "${str[iLenMax]}, ${str[iLenMax].length}"
}