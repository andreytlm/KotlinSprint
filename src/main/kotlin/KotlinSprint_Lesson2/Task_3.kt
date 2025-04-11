package org.example.KotlinSprint_Lesson2

fun main() {
    val hoursOfDeparture = 9
    val minutesOfDeparture = 39
    val minutesInWay = 457
    val summaryMinutes = hoursOfDeparture * MINUTES_IN_HOUR + minutesOfDeparture + minutesInWay
    val hoursOfArrive = (summaryMinutes / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val minutesOfArrive = summaryMinutes % MINUTES_IN_HOUR

    println("Поезд прибывает в ${"%02d".format(hoursOfArrive)}:${"%02d".format(minutesOfArrive)}")
}

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24


