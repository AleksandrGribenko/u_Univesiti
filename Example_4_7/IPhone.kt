package Example_4_7

open class IPhone(
    val iosVersion: String,
    brand: String,
    model: String,
    batCapacity: Int,
) : Smartphone(brand, model, batCapacity) {
    override fun makeCall(phoneNumber: String) {
        println("Звонок с iPhone $model на номер $phoneNumber")
    }
}