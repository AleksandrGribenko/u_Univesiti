package Example_4_8


class Magnit(prise: Int) : Shop(prise) {

    override fun getDiscount(): Int {
        if (prise > 100) return 5
        else if (prise > 200) return 10
        return 0
    }

    override fun infoDicount() {
        println("В магазине действует скидка ${getDiscount()} " + "процентов")
    }

    override fun infoToString() {
        println("Магазин \"Магнит\"")
    }
}