package E_50.Example_52

//Написать программу по продаже билетов в кино. Пользователь покупает билет, в который заносятся данные названия фильма, места и времени начала сеанса.
// Проданные билеты заносятся в массив архива. По желанию можно вывести все проданные билеты на фильм.
fun main() {
    val ticket =
        Ticket(0, "", 0, "")       //readln().toInt(), readln().toString(), readln().toInt(), readln().toString()
    var arrayOfTicket: Array<Ticket> = arrayOf()
    var id = 0
    do {
        println("1 - Продать билет \n2 - Показать проданые билеты\n0 - Закрыть кассу1")
        var choice=readln().toInt()
        if (choice == 1) {
            val n = 1
            id++        //val id =
            print("названия фильма : - \t")
            val moveName = readln().toString()
            print("место : - \t")
            val seatNumber = readln().toInt()
            print("начало сеанса: - \t")
            val startTime = readln().toString()
            arrayOfTicket += Ticket(id, moveName, seatNumber, startTime)


        } else if(choice==2){
            //println(arrayOfTicket.contentToString())
            for(i in arrayOfTicket.indices){
                println(arrayOfTicket[i])
            }

        }else if (choice == 0) {
            break
        } else {
            println("Повторите ввод")
        }
    } while (true)




}