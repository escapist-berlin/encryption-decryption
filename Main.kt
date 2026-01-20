package encryptdecrypt

fun main() {
    val msg = readln()
    val key = readln().toInt()
    val alphabet = ('a'..'z').toList()
    val result = msg.map { ch ->
        if (ch in alphabet) {
            val idx = (alphabet.indexOf(ch) + key) % 26
            alphabet[idx]
        } else {
            ch
        }
    }.joinToString("")
    println(result)
}