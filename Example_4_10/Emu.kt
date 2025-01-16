package Example_4_10

class Emu : Bird("Эму", false) {
    init {
        wingspan = 1.5 // Размах крыльев для эму
        color = "Темно-коричневый"
    }

    override fun getInfo(): String {
        return super.getInfo() + ", Особенности: не может летать"
    }
}