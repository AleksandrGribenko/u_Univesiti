package Example_4_9_interface

abstract class EmergencyServices(
    val name:String,
    val phone:String
) {
    abstract fun serviceDescription():String
}