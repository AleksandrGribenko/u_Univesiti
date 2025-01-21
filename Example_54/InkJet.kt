package E_50.Example_54

class IncJet(
    type: String,
    name: String,
    inkVolume: Int,
    private val yInkVolume: Int,
    private val mInkVolume: Int,
    private val cInkVolume: Int,
) : Printer(type, name, inkVolume) {//


    override fun readyToWork(): Boolean {
        if (yInkVolume < 10 && mInkVolume < 10 && cInkVolume < 10 && inkVolume < 10) {
            return false
        }
        return true
    }

    override fun printerInfo(): String {
        if(readyToWork()){
        return "$type $name\nУровни чернил: \nчерный: $inkVolume\n" +
                "желтый: $yInkVolume\nпурпурный: $mInkVolume\nголубой: $cInkVolume\nк работе готов"
        }
        else return "$type $name\nУровни чернил: \nчерный: $inkVolume\n" +
                "желтый: $yInkVolume\nпурпурный: $mInkVolume\nголубой: $cInkVolume\nк работе не готов"
    }


}






