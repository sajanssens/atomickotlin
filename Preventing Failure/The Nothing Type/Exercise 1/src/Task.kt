// NothingType/NothingTypeSoln1.kt
package theNothingTypeExercise1

import atomictest.capture
import atomictest.trace

class Failure(message: String) : Exception(message)

fun fail(msg: String): Nothing {
    trace(msg)
    throw Failure(msg)
}

fun require(test: Boolean) {
    if (!test) fail("require() failed")
}

fun check(test: Boolean) {
    if (!test) fail("check() failed")
}

fun main() {
    val i = 9

    require(i == 9)
    check(i == 9)

    capture {
        require(i < 9)
    } eq "Failure: require() failed"
    capture {
        check(i > 10)
    } eq "Failure: check() failed"

    trace eq """
    require() failed
    check() failed
  """
}
