package Example_4_9_interface

class FireDepartment(
    name:String,
    phone:String
) :EmergencyServices(name,phone),Describable{
    override fun serviceDescription():String {
        return "Тушение пожаров"
    }

    override fun getDescription(): String {
        return "$name $phone"
    }
}