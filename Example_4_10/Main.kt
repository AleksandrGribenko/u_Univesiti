package Example_4_10

fun main() {
    val pelican = Pelican()
    val emu = Emu()

    println(pelican.getInfo())
    println(emu.getInfo())
    //Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
    //"Домашнее задание по теме \"Переопределение функций и свойств\""

    val words = arrayOf("Домашнее", "задание", "по", "теме", "Переопределение", "функций", "и", "свойств")
    val (longestWord, length) = findLongestWord(words)

    println("Самое длинное слово: $longestWord")
    println("Количество букв в этом слове: $length")

//Дана строка «ПриВет, кАк деЛа». Необходимо найти символы, находящиеся в верхнем регистре, вывести их и посчитать их количество.
    val stroke = "ПриВет, кАк деЛа"
    val upperChar = searchUpper(stroke)
    println("Символы в верхнем регистре : ${upperChar} в количестве ${upperChar.size}")
}

fun searchUpper(stroke: String): MutableList<Char> { //String
    val upperChar = mutableListOf<Char>()
    for (char in stroke) {
        if (char.isUpperCase()) {
            upperChar.add(char)
        }
    }
    return upperChar
}

fun findLongestWord(words: Array<String>): Pair<String, Int> {
    var longestWord = ""

    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }

    return Pair(longestWord, longestWord.length)
}