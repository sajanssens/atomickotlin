// Destructuring/Task1.kt
package destructuringDeclarationsExercise1

import atomictest.eq

fun calculate(n1: Int, n2: Int): MyTriple<Boolean, Int, Int> =
    if (n1 < 0 || n2 < 0) MyTriple(false, 0, 0)
    else MyTriple(true, n1 + n2, n1 * n2)

data class MyTriple<T, R, V>(val first: T, val second: R, val third: V)

fun main() {
    val result = calculate(5, 7)
    result.first eq true
    result.second eq 12
    result.third eq 35
    val (success, plus, multiply) =
        calculate(11, 13)
    success eq true
    plus eq 24
    multiply eq 143
}
