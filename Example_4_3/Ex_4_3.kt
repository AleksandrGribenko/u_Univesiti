package Example_4_3

fun main() {
    val helicopter = Helicopter()
    helicopter.name = "K-52 Alligator"
    helicopter.weight = 10800
    helicopter.speed = 260
    helicopter.height = 5500
    helicopter.Ttx()

    val pet = Pet()
    pet.type = "кошка"
    pet.nickname = "Персик"
    pet.weight = 4.5
    pet.PetTtx()

    //Даны переменная с плавающей точкой, равная 5,87. Необходимо привести ее к целочисленному типу.
    val a:Double = 5.87
    val b:Int=a.toInt()
    println(b)
}