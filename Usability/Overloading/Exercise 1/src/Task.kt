// Overloading/Task1.kt
package overloadingExercise1

// Implement class Dog
class Dog() {
    fun bark(n: Int) = bark(n, "woof")

    fun bark(n: Int, say: String) {
        for (i in 0 until n) println(say)
    }

}

fun main() {
    val dog = Dog()
    dog.bark(3)
    dog.bark(2, "wow")
}
/* Expected output:
woof
woof
woof
wow
wow
 */
