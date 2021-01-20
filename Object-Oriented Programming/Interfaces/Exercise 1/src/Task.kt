// Interfaces/Task1.kt
package interfacesExercise1

import atomictest.eq

// TODO LAB

interface Computer {
    fun calculateAnswer(): Int
}

class Cloud(n: Int) : Computer {
    private val nodes = mutableListOf<Node>()

    init {
        for (i in 0 until n) {
            nodes.add(Node(i))
        }
    }

    override fun calculateAnswer() =
        nodes.map { it.result }.sum()

}

class Node(val result: Int) : Computer {
    override fun calculateAnswer() = result
}

fun main() {
    Cloud(10).calculateAnswer() eq 45
}
