// SafeCallsAndElvis/Task3.kt
package safeCallsAndTheElvisOperatorExercise3

data class Client(
    val name: String,
    val personalInfo: PersonalInfo? = null
)

data class PersonalInfo(
    val email: String? = null,
    val address: Address? = null
)

data class Address(
    val country: String? = null,
    val city: String? = null,
    val street: String? = null
)

val unspec = "Unspecified"

fun Client.fullInfo(): String = """
  name: $name
  email: ${personalInfo?.email ?: unspec}
  country: ${personalInfo?.address?.country ?: unspec}
  city: ${personalInfo?.address?.city ?: unspec}
  street: ${personalInfo?.address?.street ?: unspec}
""".trimIndent()

fun main() {
    val alice = Client(
        "Alice",
        PersonalInfo(
            email = "alice@gmail.com",
            address = Address("Germany", "Munich")
        )
    )
    println(alice.fullInfo())
    println("---")
    println(Client("Bob").fullInfo())
}
/* Output:
name: Alice
email: alice@gmail.com
country: Germany
city: Munich
street: Unspecified
---
name: Bob
email: Unspecified
country: Unspecified
city: Unspecified
street: Unspecified
*/
