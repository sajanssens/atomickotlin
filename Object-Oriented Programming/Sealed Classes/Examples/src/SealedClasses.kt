// SealedClasses/SealedClasses.kt
package sealedclasses

import atomictest.eq

sealed class Transport {
    abstract val capacity: Int
}

data class Train(val line: String, override val capacity: Int = 0) : Transport()
data class Bus(val number: String, override val capacity: Int) : Transport()
data class Tram(val route: String, override val capacity: Int) : Transport()

fun travel(transport: Transport) =
    when (transport) {
        is Train -> "Train ${transport.line}"
        is Bus -> "Bus ${transport.number}: "
        is Tram -> "Tram ${transport.route}: "
    } + "size ${transport.capacity}"

fun main() {
    listOf(Train("S1"), Bus("11", 90), Tram("Lijn 6", 100))
        .map(::travel) eq
            "[Train S1, Bus 11: size 90, Tram Lijn 6: size 100]"
}
