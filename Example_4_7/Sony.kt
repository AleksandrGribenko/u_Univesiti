package Example_4_7

class Sony(
    iosVersion:String,
    model:String,
    batCapacity:Int
):IPhone(iosVersion, "Sony", model,batCapacity) {
    override fun makeCall(phoneNumber: String) {
        println("Звонок с Sony $model на номер $phoneNumber")
    }
}