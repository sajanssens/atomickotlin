// Sequences/Task7.kt
package sequencesExercise7

fun oddWithout1(): Sequence<Int> =
    generateSequence(3) { it + 2 }
        .filter { '1' !in it.toString() }

fun main() {
    println(oddWithout1().take(20).sum())
}
