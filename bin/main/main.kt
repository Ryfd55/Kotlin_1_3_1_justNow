const val secInMin = 60
const val minInHour = 60
const val hourInDay = 24

fun agoToText(sec: Int): String {
    val minCount = sec / 60
    val hourCount = sec / 3600
    val minDelc = getMinDecl(minCount)
    val hourDelc = getHourDecl(hourCount)
    val st = when {
        sec < secInMin -> "только что"
        sec < secInMin * minInHour -> "$minCount $minDelc назад"
        sec < secInMin * minInHour * hourInDay -> "$hourCount $hourDelc назад"
        sec < secInMin * minInHour * hourInDay * 2 -> "вчера"
        sec < secInMin * minInHour * hourInDay * 3 -> "позавчера"
        else -> {
            "давно"
        }
    }
    return st
}

fun getMinDecl(min: Int): String {
    return when {
        min in 11..14 -> "минут"
        min % 10 == 1 -> "минуту"
        min % 10 in 2..4 -> "минуты"
        else -> {
            "минут"
        }
    }
}

fun getHourDecl(hour: Int): String {
    return when {
        hour in 11..14 -> "часов"
        hour % 10 == 1 -> "час"
        hour % 10 in 2..4 -> "часа"
        else -> {
            "часов"
        }
    }
}

fun main() {
    println("введите время в сек.:")
    val sec: Int =
        readLine()!!.toInt()
    val res = agoToText(sec)
    print("был(а) $res")
}
