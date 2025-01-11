package Example_4_9_interface

fun main() {
    val fireDepartment = FireDepartment("Пожарная охрана", "01")
    println(fireDepartment.getDescription())
    println(fireDepartment.serviceDescription())
    getLine("-")

    val police = Police("Полиция", "02")
    println(police.getDescription())
    println(police.serviceDescription())
    getLine("-")

    val ambulance = Ambulance("Скорая помощь", "03")
    println(ambulance.getDescription())
    println(ambulance.serviceDescription())
    getLine("-")

    val gasService = GasService("Служба газа", "04")
    println(gasService.getDescription())
    println(gasService.serviceDescription())
    getLine("-")

    //Даны целые положительные числа A и B. Найти их наибольший общий делитель (НОД), используя алгоритм Евклида: НОД(A,B) = НОД(B, A mod B), если B≠0; НОД(A, 0) = A.
    println("Введите целые положительные числа A и B")
    val a = readln().toInt()
    val b = readln().toInt()
    println("наибольший общий делитель = ${Nod(a, b)}")

    //Дан набор целых чисел. Найти второе максимальное число.
    val searchX = 2
    val numbers = arrayOf(5, 6, 7, 8, 9, 8, 7, 4, 9, 6, 3, 2, 1, 9, 5, 4, 5, 6, 7, 8, 9)
    var iMax = 0
    for (i in numbers.indices) {
        if (numbers[iMax] < numbers[i]) {
            iMax = i
        }
    }
    for (i in numbers.indices) {
        var j = 0
        if (numbers[iMax] == numbers[i]) j++
        if (j == searchX) break
    }
    println("второе максимальное число: index $iMax  number ${numbers[iMax]}")
}

fun Nod(x: Int, y: Int): Int {
    var a = x
    var b = y
    while (b != 0) {
        val tmp = a % b
        a = b
        b = tmp
    }
    return a
}

fun getLine(sample: String) {
    for (i in 0..50) {
        print(sample)
    }
    println()
}


