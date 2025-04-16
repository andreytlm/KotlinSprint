fun main() {
    var checkWeightAverage = 20
    var checkVolumeAverage = 80
    var checkCondition = checkWeightAverage > MIN_WEIGHT_FOR_AVERAGE && checkWeightAverage <= MAX_WEIGHT_FOR_AVERAGE && checkVolumeAverage < VOLUME_FOR_AVERAGE

    println("Груз с весом $checkWeightAverage кг и объемом $checkVolumeAverage л соответствует категории 'Average': $checkCondition")

    checkWeightAverage = 50
    checkVolumeAverage = 100
    checkCondition = checkWeightAverage > MIN_WEIGHT_FOR_AVERAGE && checkWeightAverage <= MAX_WEIGHT_FOR_AVERAGE && checkVolumeAverage < VOLUME_FOR_AVERAGE

    println("Груз с весом $checkWeightAverage кг и объемом $checkVolumeAverage л соответствует категории 'Average': $checkCondition ")
}

const val MIN_WEIGHT_FOR_AVERAGE = 35 // не включительно
const val MAX_WEIGHT_FOR_AVERAGE = 100 //включительно
const val VOLUME_FOR_AVERAGE = 100 // не включительно