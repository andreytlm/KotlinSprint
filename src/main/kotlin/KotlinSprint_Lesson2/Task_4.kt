package KotlinSprint_Lesson2

fun main() {
    val crystalOre = 7
    val metalOre = 11
    val buffWorkedForCrystalOre = crystalOre * BUFF_20
    val buffWorkedForMetalOre = metalOre * BUFF_20

    println("Now your crystal ore = ${buffWorkedForCrystalOre.toInt()}")
    println("Now your metal ore = ${buffWorkedForMetalOre.toInt()}")
}

const val BUFF_20 = 1.2