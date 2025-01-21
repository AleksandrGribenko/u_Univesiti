package E_50.Example_54

abstract class Printer(val type: String, val name: String, val inkVolume: Int) {
    abstract fun readyToWork(): Boolean

    abstract fun printerInfo():String


}



