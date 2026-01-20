package encryptdecrypt

fun main() {
    val msg = "we found a treasure!"
    val alphabet = ('a'..'z').toList()
    val result = msg.map { ch ->
        if (ch in alphabet) alphabet[25 - alphabet.indexOf(ch)] else ch
    }.joinToString("")
    println(result)
}