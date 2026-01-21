package encryptdecrypt

fun main() {
    val operation = readln()
    val msg = readln()
    val key = readln().toInt()

    val result = when (operation) {
        "enc" -> encrypt(msg, key)
        "dec" -> decrypt(msg, key)
        else -> "Invalid operation"
    }

    println(result)
}

fun encrypt(msg: String, key: Int): String {
    return msg.map { ch ->
        (ch.code + key).toChar()
    }.joinToString("")
}

fun decrypt(msg: String, key: Int): String {
    return msg.map { ch ->
        (ch.code - key).toChar()
    }.joinToString("")
}