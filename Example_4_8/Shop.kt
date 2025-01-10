package Example_4_8

abstract class Shop (val prise:Int,){
    abstract fun getDiscount(): Int
    open fun infoDicount(){
        println("В магазине действует скидка")
    }
    open fun infoToString(){
        println()
    }
}