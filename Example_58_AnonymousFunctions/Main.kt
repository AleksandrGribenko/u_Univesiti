package E_50.Example_58_AnonymousFunctions

fun main() {
    //Написать анонимную функцию – поздравление с наступающим новым годом. Ее тип следующий (String, Int) -> String.
    // Где первый параметр имя, кого поздравляют, второй с каким годом поздравляют.
    // Эти аргументы должны вписываться в контекст поздравления, которое составлено в теле функции.
    val name = readln()
    val age = readln().toInt()
    val greeting = fun(name: String, age: Int) = ("$name!, Поздравляю с Новым $age годом!")
    println(greeting(name, age))

    // Создать массив целых чисел произвольного размера. Написать анонимную функцию isEven, проверяющую число на четность, она возвращает логический тип.
    // Написать функцию checkArrayElement проверки массива и его элементов на четность, она на вход принимает массив и вторым параметром анонимную функцию типа isEven.
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)

    val isEven = fun(a: Int): Boolean {
        return a % 2 == 0
    }
    checkArrayElement(arr, isEven)


}

fun checkArrayElement(arr: Array<Int>, ev: (Int) -> Boolean) {
    val result = arr.map { ev(it) }
    println(result)
}

