package Example_4_7

open class Smartphone(
    val brand: String,
    val model: String,
    val batCapacity: Int,
) {
    open fun makeCall(phoneNumber: String) {
        println("Звонок на номер $phoneNumber с $brand $model")
    }
}