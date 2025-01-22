package E_50.Example_56_TypesOfFunction

fun main() {
    //Написать программу, которая будет вычислять факториал числа с применением рекурсии.
    val number = readln().toInt()
    println(getFactorial(number))

    //  Написать функцию, которая находит N-ю степень числа 10 с применением рекурсии.
    val degree = readln().toInt()
    println(degreeOfTheNumber(degree))

    // Дан массив val array = arrayOf(1, 2, 3, 4, 5, 6, 7).
    // Написать функцию, которая будет увеличивать элемент массива на единицу, находящийся через одну позицию.
    // Т.е. массив на выходе будет такой [2, 2, 4, 4, 6, 6, 8].
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println(magnificationWithAlternation(array).contentToString())
}

fun magnificationWithAlternation(array: Array<Int>): Array<Int> {
    for(i  in array.indices ){
        if(array[i]%2!=0) array[i]+=1
    }
    return array
}

fun degreeOfTheNumber(degree: Int): Int {
    if (degree == 1) return 10
    return 10 * degreeOfTheNumber(degree - 1)
}

fun getFactorial(number: Int): Int {
    if (number == 1) return number
    return number * getFactorial(number - 1)
}