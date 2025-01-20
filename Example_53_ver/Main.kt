package E_50.Example_53_ver

fun main() {

    val seasonNow = SeasonNow()

    do {
        val month = readln()
        seasonNow.month = month

        seasonNow.setSeasonNow(month)

        println("${seasonNow.month}, ${seasonNow.season}")

        println(seasonNow.getCalendar())
        println("1. Продолжить ввод\n2. Завершить программу")
    } while (readln() == "1")
    //Дана строка «Шумоизоляция». Посчитать количество повторяющихся символов.
    val stroke = "Шумоизоляция"
    println("В слове $stroke имеется ${checkRepeat(stroke)} повтора(ов)")
}
fun checkRepeat(stroke:String):Int{
    val str = stroke.toLowerCase().toCharArray()
    var sum:Int=0
    for(i in str.indices){
        for(j in str.indices){
            if(i<j){
                if(str[i]==str[j]){
                    sum++
                }
            }
        }
    }
    return sum
}








