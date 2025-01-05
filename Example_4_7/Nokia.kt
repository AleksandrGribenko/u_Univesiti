package Example_4_7

class Nokia(
    model:String,
    batCapacity:Int
) :Smartphone("Nokia",model,batCapacity){
    override fun makeCall(phoneNumber: String) {
        println("Звонок с Nokia $model на номер $phoneNumber")
    }
}