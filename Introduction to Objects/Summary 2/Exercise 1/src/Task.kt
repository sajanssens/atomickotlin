// Summary2/Task1.kt
package summaryIIExercise1

import atomictest.eq

// add Boring class
class Boring {
    fun a() = 1.618
    fun b() = "ratio"
    fun c() = 11
}

fun main() {
    // test Boring
    val boring = Boring()
    boring.a() eq 1.618
    boring.b() eq "ratio"
    boring.c() eq 11
}
