package Example_4_3

class Helicopter {
    var name: String = ""
    var weight = 0
    var speed = 0
    var height = 0
    fun Ttx() {
        println(
            "Спроектировали вертолет с названием ${name} " +
                    "скоростью полета ${speed} весом ${weight} " +
                    "высотой полета ${height}"
        )
    }
}
