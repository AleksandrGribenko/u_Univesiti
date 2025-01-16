package Example_4_10

class Pelican : Bird("Пеликан", true) {
    init {
        wingspan = 2.5 // Размах крыльев для пеликанов
        color = "Белый с черными полосами"
    }

    override fun getInfo(): String {
        return super.getInfo() + ", Особенности: крупная голова, длинный клюв"
    }
}