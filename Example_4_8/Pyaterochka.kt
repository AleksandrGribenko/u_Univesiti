package Example_4_8

class Pyaterochka (prise:Int):Shop(prise){
    override fun getDiscount(): Int {
//        if (prise > 100) return 5
//        else if (prise > 200) return 10
        return 0
    }

    override fun infoDicount() {
        println("Праздники закончились. В магазине действует скидка ${getDiscount()}")
    }
    override fun infoToString(){
        println("Магазин \"Пятерочка\"")
    }
}