package Example_5

fun main() {
//Пользователь вводит с клавиатуры число.
// Требуется посчитать факториал числа. Например, если введено 3, факториал числа 1*2*3 = 6.
    val a = readln().toInt()
    var i = 1
    var factorial: Int = 1
    while (i <= a) {
        factorial *= i
        i++
    }
    println("Факториал $a = $factorial")
    //Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, …, 10 кг конфет.
    val prise = 5
    i = 1
    while (i <= 10) {
        val z = prise * i
        println("цена за  $i кг = $z")
        i++
    }
//Даны два целых числа A и B (A<B).
// Вывести в порядке возрастания все целые числа, расположенные между A и B (включая сами числа A и B), а также количество Nэтих чисел.
    var x: Int
    var y: Int
    println("Введите число А и Б")
    do {
        x = readln().toInt()
        y = readln().toInt()
    } while (x > y)
    var n = 0
    while (x <= y) {
        //++x
        println(x++)
        n++
    }
    println(n)
    //Дано целое число N (>0). Используя операции деления нацело и взятия остатка от деления, вывести все его цифры, начиная с самой правой.

    do {
        println("Введите N")
        n = readln().toInt()
    } while (n < 0)
    while (n > 0) {
        println(n % 10)
        n /= 10
    }
    println()
//Напишите программу, в которой выводятся на экран числа от 1 до 20 включительно со следующими условиями:
// если числа нечетные – их не выводить на экран, если делятся на 4 без остатка – умножаем на 2, если число равно 19 завершаем программу.
    n = 1
    while (n <= 20) {
        if (n == 19) break
        if (n % 4 == 0) {
            println(n * 2)
        } else if (n % 2 == 0) println(n)
        //n+=2
        n++
    }
    //За каждый месяц банк начисляет к сумме вклада 7% от суммы.
// Напишите программу, в которой вычисляется конечная сумму вклада с учетом начисления процентов за каждый месяц.
// Сумма вклада равна 350, количество месяцев – 9.
    var amount:Double = 350.0
    var percent:Double = 0.07
    var month=9
    while(month>0){
        amount+=amount*percent
        month--
    }
    println("конечная суммa вклада $amount")

}