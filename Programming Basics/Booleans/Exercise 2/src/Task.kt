// Booleans/Task2.kt
package booleansExercise2

fun showAnd(first: Boolean, second: Boolean) = println("$first && $second == ${first && second}")

fun showOr(first: Boolean, second: Boolean) = println("$first || $second == ${first || second}")

fun showTruthTable() {
    for (a in 0..1)
        for (b in 0..1) {
            showAnd(a == 0, b == 0)
            showOr(a == 0, b == 0)
        }
}

fun main() {
    showTruthTable()
}
