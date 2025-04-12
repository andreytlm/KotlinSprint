package KotlinSprint_Lesson2

fun main() {
    val crystalOre = 7
    val metalOre = 11
    val buffPlayer = 20

    val crystalOreAfterBuff = (crystalOre.toDouble() / TO_PROCENT) * buffPlayer.toDouble() + crystalOre
    val metalOreAfterBuff = (metalOre.toDouble() / TO_PROCENT) * buffPlayer.toDouble() + metalOre

    println("Now your crystal ore = ${crystalOreAfterBuff.toInt()}")
    println("Now your metal ore = ${metalOreAfterBuff.toInt()}")
}

const val TO_PROCENT = 100