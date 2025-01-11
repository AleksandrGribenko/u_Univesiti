package Example_4_9_interface

class GasService(
    name: String,
    phone: String,
) : EmergencyServices(name, phone), Describable {
    override fun serviceDescription(): String {
        return "Служба газа"
    }

    override fun getDescription(): String {
        return "$name $phone"
    }
}