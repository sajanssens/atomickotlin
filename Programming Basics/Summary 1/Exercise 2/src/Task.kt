// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
    var result = ""
    s.forEachIndexed { index, c ->
        if (index % 2 == 0)
            result = result.plus(c)
    }
    return result
}

fun main() {
    println(other("cement"))
}
/* Output:
cmn
*/
