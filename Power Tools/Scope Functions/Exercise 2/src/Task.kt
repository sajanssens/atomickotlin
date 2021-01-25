// ScopeFunctions/Task2.kt
package scopeFunctionsExercise2

import atomictest.trace
import classdelegation.SpaceShipControls

fun main() {
    var velocity = 1
    with(SpaceShipControls()) {
        trace(forward(velocity))
        trace(right(velocity))
        trace(down(velocity))
        this
    }.let {
        velocity++
        trace(it.forward(velocity))
        trace(it.right(velocity))
        trace(it.down(velocity))
        it
    }.run {
        trace(forward(++velocity))
        trace(right(velocity))
        trace(down(velocity))
        this
    }.apply {
        trace(forward(++velocity))
        trace(right(velocity))
        trace(down(velocity))
    }.also {
        trace(it.forward(++velocity))
        trace(it.right(velocity))
        trace(it.down(velocity))
    }
    trace eq """
    forward 1
    right 1
    down 1
    forward 2
    right 2
    down 2
    forward 3
    right 3
    down 3
    forward 4
    right 4
    down 4
    forward 5
    right 5
    down 5
  """
}
