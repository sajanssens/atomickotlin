// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
    var result = ""

    var i = 0
    for (c in s) {
        if (i++ % 2 == 0) result += c
    }

    // or
    // s.forEachIndexed { index, c -> if (index % 2 == 0) result += c }

    return result
}

fun main() {
    println(other("cement"))
}
/* Output:
cmn
*/
