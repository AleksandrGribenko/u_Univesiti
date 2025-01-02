package Example_4_6

fun main() {

    val card = Card()
    card.numberOfCard = readln().toString()
    card.passOfCard = readln().toInt()
    println(card.numberOfCard)
    println(card.passOfCard)

//Дана переменная a – целое число.
// Используя составные операторы присваивания необходимо выполнить операции: a увеличить на 7,
// полученное число уменьшить на 4,
// далее полученный результат умножить на 2 и найти остаток от деления разделив на 3.
    println("Введите А")
    var a = readln().toInt()
    a += 7
    println("увеличение на 7 = $a")
    a -= 4
    println("уменьшение на 4 = $a")
    a *= 2
    println("умножение на 2 = $a")
    a % 3
    println("остаток от деления на 3 = $a")

    println(a)

//Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа. 753 -> 357.
    println("ведите двузначное число")
    a = readln().toInt()
    while (a != 0) {
        print(a % 10)
        a /= 10
    }
    println()
}