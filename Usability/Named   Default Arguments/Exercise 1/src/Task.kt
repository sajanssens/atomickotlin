// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1

class Rectangle(val side1: Double = 1.0,
                val side2: Double = 2.0,
                val color: String = "yellow") {
    override fun toString(): String = "Rectangle ${side1}x$side2 of '$color' color"
}

fun main() {
    println(Rectangle())

    println(Rectangle(side1 = 2.0))
    println(Rectangle(side2 = 3.0))
    println(Rectangle(color = "red"))
    println(Rectangle(4.0, 5.0, "blue"))
}
