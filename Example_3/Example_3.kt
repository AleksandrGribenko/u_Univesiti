package Example_3

fun main() {
    var x = 25
    if (x > 0) {
        x++
    }
    println(x)
    val a = 4
    val b = 45
    val c = -2
    val d = 8
    var result = 0
    if (a > 0) result++
    if (b > 0) result++
    if (c > 0) result++
    if (d > 0) result++
    println(result)

    if (a > b) println(a)
    else println(b)

    val w = 5
    if (w == 1) {
        println("понедельник")
    }
    if (w == 2) {
        println("вторник")
    }
    if (w == 3) {
        println("среда")
    }
    if (w == 4) {
        println("четверг")
    }
    if (w == 5) {
        println("пятница")
    }
    if (w == 6) {
        println("суббота")
    }
    if (w == 7) {
        println("воскресенье")
    }
    val k = 3

    if (k == 1) println("плохо")
    else if (k == 2) println("неудовлетворительно")
    else if (k == 3) println("удовлетворительно")
    else if (k == 4) println("хорошо")
    else if (k == 5) println("отлично")
    else println("ошибка")

    val f = 2
    val one: Double = 3.0
    val two: Double = 5.8
    var three: Double =0.0
    if (f == 1) {
        three = one + two
    }
    if (f == 2) {
        three = one - two
    }
    if (f == 3) {
        three = one * two
    }
    if (f == 4) {
        three = one / two
    }
    println( three)
}