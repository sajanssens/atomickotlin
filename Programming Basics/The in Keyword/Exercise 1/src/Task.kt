// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
    val sb = StringBuilder()
    for (c in 'a'..'z') {
        sb.append(c)
    }
    return sb.toString()
}

fun main() {
    println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}
