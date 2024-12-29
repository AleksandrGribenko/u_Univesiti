package Example_4_3

class Pet {
    var type: String = ""
    var nickname: String = ""
    var weight = 0.0

    fun PetTtx() {
        println(
            "Домашнее животное: " + type +

                    "\nКличка: " + nickname +

                    "\nВес: " + weight
        )
    }
}