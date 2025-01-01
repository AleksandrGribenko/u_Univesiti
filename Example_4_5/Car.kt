package Example_4_5

class Car(wegth: Double, speed: Int) {
    private val wegth = wegth
    private val speed = speed

    fun carInfo() {
        if (speed == 0) {
            println("Автомобиль остановлен")
        } else {
            println("Автомобиль движется со скоростью $speed км/ч" )
        }
    }
}