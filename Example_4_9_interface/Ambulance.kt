package Example_4_9_interface

class Ambulance (
    name:String,
    phone:String
) :EmergencyServices(name,phone),Describable{
    override fun serviceDescription():String {
        return "Оказание медицинской помощи"
    }

    override fun getDescription(): String {
        return "$name $phone"
    }
}