package E_50.Example_58_AnonymousFunctions

fun main(){
    //Напишите анонимную функцию для объединения двух строк и возврата результата.
    val strokeOne: String = readln()
    val strokeTwo: String = readln()
    val concatenation = fun(one: String, two: String): String {
        return "$one$two"
    }

    println(concatenation(strokeOne, strokeTwo))
}