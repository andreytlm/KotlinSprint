package lesson3

fun main() {
    val numeric = 4

    println(
        """
        $numeric * $numeric1 = ${numeric * numeric1}
        $numeric * $numeric2 = ${numeric * numeric2}
        $numeric * $numeric3 = ${numeric * numeric3}
        $numeric * $numeric4 = ${numeric * numeric4}
        $numeric * $numeric5 = ${numeric * numeric5}
        $numeric * $numeric6 = ${numeric * numeric6}
        $numeric * $numeric7 = ${numeric * numeric7}
        $numeric * $numeric8 = ${numeric * numeric8}
        $numeric * $numeric9 = ${numeric * numeric9}
    """.trimIndent()
    )
}
const val numeric1 = 1
const val numeric2 = 2
const val numeric3 = 3
const val numeric4 = 4
const val numeric5 = 5
const val numeric6 = 6
const val numeric7 = 7
const val numeric8 = 8
const val numeric9 = 9