package lesson3

fun main() {
    var sunnyWeather = true
    var openAwning = true
    var airHumidity = 20
    var season = "зима"
    var beanGrowth = sunnyWeather && openAwning && (airHumidity == 20) && season != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $beanGrowth")
}