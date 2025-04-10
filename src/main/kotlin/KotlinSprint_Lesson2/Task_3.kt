package org.example.KotlinSprint_Lesson2

fun main() {
    val summaryMinutes = hoursOfDeparture * 60 + minutesOfDeparture + minutesInWay
    val hoursOfArrive = (summaryMinutes / 60) % 24
    val minutesOfArrive = summaryMinutes % 60

    println("Поезд прибывает в ${"%02d".format(hoursOfArrive)}:${"%02d".format(minutesOfArrive)}")
}

const val hoursOfDeparture = 9
const val minutesOfDeparture = 39
const val minutesInWay = 457
