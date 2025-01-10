package Example_4_8

fun main() {
    val magnit = Magnit(250)
    magnit.infoToString()  //
    println("Цена товара - ${magnit.prise}")
    magnit.infoDicount() //
    print("Стоимость покупки - ")
    println(magnit.prise - (magnit.prise / 100 * magnit.getDiscount()))
    println("______________________")
    val pyaterochka = Pyaterochka(200)
    pyaterochka.infoToString()
    println("Цена товара - ${pyaterochka.prise}")
    pyaterochka.infoDicount() //
    print("Стоимость покупки - ")
    println(pyaterochka.prise - (pyaterochka.prise / 100 * pyaterochka.getDiscount()))
    println("______________________")

    //************************************//
    val student = Student("Иван", "Петров", 20, "12334")
    println(student.getDescription())
    println(student.doActivity())

    val employee = Employee("Сергей", "Сидоров", 30, "Менеджер")
    println(employee.getDescription())
    println(employee.doActivity())

    println("-----------------------------------")
    println("\nЕдиницы длины : 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр")
    var measure:Int
    do {
        measure = readln().toInt()
    } while (measure < 1 || measure > 5)
    println("Длина отрезка в метрах")
    val number = readln().toDouble()
    when (measure) {

        1 -> println(number * 10)
        2 -> println(number / 1000)
        3 -> println(number)
        4 -> println(number * 1000)
        5 -> println(number * 100)
    }
}