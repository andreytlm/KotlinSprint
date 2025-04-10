package org.example.KotlinSprint_Lesson2

fun main() {
    val hoursOfDeparture = 0
    val minutesOfDeparture = 57
    val minutesWay = 457

    val minutesToHours = minutesWay / 60
    val dayFormat = (hoursOfDeparture+minutesToHours) % 24
    var hoursOfArriveTrain:Int
    if (hoursOfDeparture+dayFormat>24) {
        hoursOfArriveTrain = dayFormat
    }
    else {
        hoursOfArriveTrain = hoursOfDeparture + dayFormat
    }

    val remainderMinutes = minutesWay % 60
    val remainderMinutesRest = minutesOfDeparture+remainderMinutes
    var minutesOfArriveTrain: Int
    var hoursFromRestMinutes: Int
    if (remainderMinutesRest>60) {
        var minutesOfArriveTrain =
    }



    println("Время прибытия поезда $hoursOfArriveTrain:$minutesOfArriveTrain")
}

