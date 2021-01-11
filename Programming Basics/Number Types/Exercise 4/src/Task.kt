// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
        hours * 60L * 60_000 + minutes * 60_000 + seconds * 1000

fun main() {
    println(convertToMilliseconds(1, 30, 0))
}
