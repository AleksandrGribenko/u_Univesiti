package E_50.Example_51


class Human(val name: String) {

    inner class Head{
        fun think(){
            println("$name думает")
        }
        fun speak(){
            println("говорит") //is speaking
        }
    }

    inner class Legs{
        fun walk(){
            println("ходит") //is walking
        }
        fun run(){
            println("бежит") //is running
        }
    }
    fun describe(){
        val head=Head()
        val legs=Legs()
        head.think()
        head.speak()
        legs.walk()
        legs.walk()
    }

}

fun main() {
    //Создать класс Human(человек). В нем создать несколько внутренних классов, например, head(голова), legs(ноги), в каждом из классов напишите функции этой части тела.
    // В главной функции опишите модель человека, вызвав всю функциональность написанных классов.
    val human = Human("Иван")
    human.describe()

    //Дан строковый массив "Иванов", "Петров", "Сидоров", "Процветов", "Протасов". Написать программу поиска и вывода на экран элементов массива по вводимым символам.
    val words = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    println(words.contentToString())
    val containsToWords = readln()
    if (words.contains(containsToWords)) println(containsToWords)
    //Создать массив целых чисел, в котором есть два нулевых элемента, не идущих подряд. Посчитать количество элементов, которые находятся между нолями.
    val arr = arrayOf(3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2)
    var iZero = -1
    var num = 0
    var flag = false
    for (i in arr.indices) {

        if (flag) {
            if (arr[i] == 0) break
            num++
        } else if (arr[i] == 0) {
            flag = true
            iZero = i
        }
    }
    println(num)

}

