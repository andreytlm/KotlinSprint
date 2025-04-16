package lesson3

fun main() {
    var trainingDay = 5
    var trainArms = trainingDay % PARITY_CHECK == NON_PARITY_NUMBER
    var trainingPress = trainArms
    var trainigLegs = !trainingPress
    var trainingBack = trainigLegs

println("""
    |Упражнения для рук: $trainArms
    |Упражнения для ног: $trainigLegs  
    |Упражнения для спины: $trainingBack
    |Упражнения для пресса: $trainingPress    
""".trimMargin())


}
const val PARITY_CHECK = 2
const val NON_PARITY_NUMBER = 1