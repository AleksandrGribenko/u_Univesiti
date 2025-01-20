package E_50.Example_53_ver

class SeasonNow {
    var month: String = ""
    var season: String = "пора в отпуск"

    val calendar = Calendar(Month.NOTHING, Season.NOTHING)


    fun getCalendar(): String {
        return "${calendar.month}, ${calendar.season}"
    }

    fun setSeasonNow(month: String) {
        when (month.toLowerCase()) {
            "январь" -> {
                calendar.month = Month.JANUARY
                calendar.season = Season.WINTER
                season = "зима"
            }

            "февраль" -> {
                calendar.month = Month.FEBRUARY
                calendar.season = Season.WINTER
                season = "зима"
            }

            "март" -> {
                calendar.month = Month.MARCH
                calendar.season = Season.SPRING
                season = "весна"
            }

            "апрель" -> {
                calendar.month = Month.APRIL
                calendar.season = Season.SPRING
                season = "весна"
            }

            "май" -> {
                calendar.month = Month.MAY
                calendar.season = Season.SPRING
                season = "весна"
            }

            "июнь" -> {
                calendar.month = Month.JUNE
                calendar.season = Season.SUMMER
                season = "лето"
            }

            "июль" -> {
                calendar.month = Month.JULY
                calendar.season = Season.SUMMER
                season = "лето"
            }

            "август" -> {
                calendar.month = Month.AUGUST
                calendar.season = Season.SUMMER
                season = "лето"
            }

            "сентябрь" -> {
                calendar.month = Month.SEPTEMBER
                calendar.season = Season.AUTUMN
                season = "осень"
            }

            "октябрь" -> {
                calendar.month = Month.OCTOBER
                calendar.season = Season.AUTUMN
                season = "осень"
            }

            "ноябрь" -> {
                calendar.month = Month.NOVEMBER
                calendar.season = Season.AUTUMN
                season = "осень"
            }

            "декабрь" -> {
                calendar.month = Month.DECEMBER
                calendar.season = Season.WINTER
                season = "зима"
            }
        }
    }
}


