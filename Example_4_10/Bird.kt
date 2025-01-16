package Example_4_10


open class Bird(val species: String, val canFly: Boolean) {
    // Свойства класса
    var wingspan: Double = 0.0
    var color: String = ""

    open fun getInfo(): String {
        return "Вид: $species, Может летать: $canFly, Размах крыльев: $wingspan м, Цвет: $color"
    }
}