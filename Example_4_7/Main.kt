package Example_4_7

fun main() {
    val cat = Cat()
    cat.name="Tom"
    cat.weight=3
    println(cat.toString())
    cat.catInfo()
    println("----------------")
    val dog = Dog()
    dog.name="rex"
    dog.weight=15
    println(dog.toString())
    dog.dogInfo()
    println("----------------")

    val nokia=Nokia("3310",900)
    nokia.makeCall("+79121234567")
    println("----------------")
    val sony=Sony("15.0","Xperia", 3000)
    sony.makeCall("+79329876532")
    println("----------------")

    val array = arrayOf(3, 67, 1, 55, 65, 89, 23)
    println(array.contentToString())
    for(i in array.indices)
        if(array[i]%5==0){
            print("${array[i]} ")
        }
    println()
}