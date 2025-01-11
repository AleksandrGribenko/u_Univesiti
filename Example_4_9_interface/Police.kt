package Example_4_9_interface

class Police (
    name:String,
    phone:String
) :EmergencyServices(name,phone),Describable{
    override fun serviceDescription():String {
        return "Правоохранительная функция"
    }

    override fun getDescription(): String {
        return "$name $phone"
    }
}