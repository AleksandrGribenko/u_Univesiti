package Example_4_6

class Card {
    var numberOfCard: String = ""
        set(value) {
            field = value
        }
        get() = field
    var passOfCard: Int = 0
        set(value) {
            field = value
        }
        get() {
            if (readln().toInt() == 12345) {
                return field
            }
            return 0
        }


}