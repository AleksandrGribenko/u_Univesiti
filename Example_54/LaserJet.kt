package E_50.Example_54

class LaserJet(type: String, name: String, inkVolume: Int) : Printer(type, name, inkVolume) {

    override fun readyToWork(): Boolean {

            return  inkVolume >= 10

    }

    override fun printerInfo(): String {
        if(readyToWork()){
            return "$type $name\nУровни чернил: $inkVolume\nк работе готов"
        } else return "$type $name\nУровни чернил: $inkVolume\nк работе не готов"

    }


}