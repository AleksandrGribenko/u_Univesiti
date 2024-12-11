package Example_2

const val PI: Double = 3.14

fun main() {
    var len: Int
    val perrimetr: Int
    len = 5
    perrimetr = 4 * len
    //println(perrimetr)


    val lenOne: Int
    lenOne = 8
    val sqare: Int
    sqare = lenOne * lenOne
    //println(sqare)
    var a_len: Int
    var b_len: Int
    a_len = 10
    b_len = 20
    val sqare2: Int
    sqare2 = a_len * b_len
    val diam: Int = 6
    val lenO = PI * diam

    len = 150
    val meter = len / 100

    a_len = 345
    b_len = 12
    val value: Int = a_len / b_len

    println("P = " + perrimetr + " | S = " + sqare + " | S2 = " + sqare2 + " | L = " + meter + " | L2 = " + value)

}