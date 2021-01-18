// NamedAndDefaultArgs/Task3.kt
package namedAndDefaultArgumentsExercise3

import atomictest.eq

fun joinComments(s: String): String =
        s.lines()
                .map { it.trim() }
                .filter { it.isNotEmpty() }
                .map { it.replace("//", "") }
                .map { it.trim() }
                .joinToString("; ")

fun main() {
    val s = """
        // First
        // Second
        // Third
        """
    joinComments(s) eq "First; Second; Third"
}
