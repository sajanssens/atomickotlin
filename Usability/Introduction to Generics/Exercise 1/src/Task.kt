// IntroGenerics/Task1.kt
package introductionToGenericsExercise1

import atomictest.eq

fun <T> List<T>.secondOrNull(): T? = if (this.size > 1) this[1] else null

fun <T> List<T>.penultimateOrNull(): T? = getOrNull(size - 2)

fun main() {

    val ints0 = listOf(1)
    ints0.secondOrNull() eq null

    val ints = listOf(1, 2, 3)
    ints.secondOrNull() eq 2
    ints.penultimateOrNull() eq 2

    val strings = listOf("a", "b", "c", "d")
    strings.secondOrNull() eq "b"
    strings.penultimateOrNull() eq "c"
}
