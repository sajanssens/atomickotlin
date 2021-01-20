// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
    val int: Int = 10
    val double: Double = 1.1
    val boolean: Boolean = false
    val string: String = "abc"
    val character: Char = 'a'

    // Can be combined:
    val d1 = int + double
    // println(int + boolean)
    // println(int + string)
    // println(int + character)

    val d2 = double + int
    // println(double + boolean)
    // println(double + string)
    // println(double + character)

    // println(boolean + int)
    // println(boolean + double)
    // println(boolean + string)
    // println(boolean + character)

    val s1 = string + int
    val s2 = string + double
    val s3 = string + boolean
    val s4 = string + character

    val c1 = character + int
    // println(character + double)
    // println(character + boolean)
    val c2 = character + string

    println(
        "The type that can be combined " +
                "with every other type using '+':"
    )
    println("String")

    // Can't be combined:
    // write some examples
    val i1 = int + int
    val d4 = double + double
    // println(boolean + boolean)
    val ss = string + string
    // println(character + character)

    println(
        "The type that can't be combined " +
                "with itself using '+':"
    )
    println("Boolean")
}
