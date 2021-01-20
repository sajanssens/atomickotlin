// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(s: String) =
    s.isNotEmpty() && s[0] in 'a'..'z'

fun main() {
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name"))  // false
}
