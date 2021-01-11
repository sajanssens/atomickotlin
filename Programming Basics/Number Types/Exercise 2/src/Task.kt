// NumberTypes/Task2.kt
package numberTypesExercise2

import kotlin.math.pow

val million: Int = 1_000_000
val millionType: String = "Int"

val billion = million * 1000
val billionType: String = "Int"

val trillion = billion * 1000L
val trillionType: String = "Long"

val quintillion = trillion * 1_000_000L
val quintillionType: String = "Long"

fun main() {
    println(million.toDouble() == 10.0.pow(6))
    println(billion.toDouble() == 10.0.pow(9))
    println(trillion.toDouble() == 10.0.pow(12))
    println(quintillion.toDouble() == 10.0.pow(15))
}
