fun main() {
    println("введите время в сек.:")
    val sec: Int =
        readLine()!!.toInt()
    val res = agoToText(sec)
    print("был(а) $res")
}

fun agoToText(sec: Int): String {
    val st = when {
        sec < 60 -> "только что"
        sec < 3600 -> "x минут назад"
        sec < 86400 -> "x часов назад"
        sec < 172800 -> "вчера"
        sec < 259200 -> "позавчера"
        else -> {
            "давно"
        }
    }
    return st
}