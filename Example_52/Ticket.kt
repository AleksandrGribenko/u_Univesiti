package E_50.Example_52

data class Ticket (val id:Int, val moveName:String,val seatNumber:Int,val startTime:String){
    override fun toString(): String {
        return "Билет№=$id, Название сеанса='$moveName', место=$seatNumber, начало сеанса='$startTime'"
    }
}