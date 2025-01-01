package Example_4_5


fun main() {
    val box: Box = Box(3, 4, 5)
    println(box.calculateVolume())
    var n: Int
    do {
        println("Введите количество чисел набора")
        n = readln().toInt()
    } while (n < 1)
    val arr = initArray(n)
    searchMin(arr)
    searchMax(arr)
    val array = arrayOf(3, 67, 1, 55, 65, 89, 23)
    println(array.contentToString())
    println("Ведите число")
    val x: Int = readln().toInt()
    descriptionNum(x)
    val car : Car = Car(1.5,0)
    car.carInfo()

}

fun descriptionNum(x: Int) {
    if (x == 0) print("нулевое ")
    else if (x > 0) {
        print("положительное ")
    } else {
        print("отрицательное ")
    }
    if (x != 0) {
        if (x % 2 == 0) {
            print("четное ")
        } else {
            print("нечетное ")
        }
    }
    println("число")
}

fun initArray(n: Int): Array<Int> {
    val arr = Array(n, { 0 })
    for (i in arr.indices) {
        arr[i] = (-10..10).random()
    }
    return arr
}

fun searchMin(arr: Array<Int>) {
    var iMin = 0
    for (i in arr.indices) {
        if (arr[iMin] > arr[i]) {
            iMin = i
        }
    }
    println("Индекс минимального числа $iMin, число ${arr[iMin]}")
}

fun searchMax(arr: Array<Int>) {
    var iMax = 0
    for (i in arr.indices) {
        if (arr[iMax] < arr[i]) {
            iMax = i
        }
    }
    println("Индекс максимального числа $iMax, число ${arr[iMax]}")
}
