package KotlinSprint_Task5

fun main() {
    val secondsInSpace: Short = 6480
    val hours = secondsInSpace/3600
    val remainderSecondsFromHours = secondsInSpace % 3600
    val minutes = remainderSecondsFromHours / 60
    val remainderSecondsFromMinutes = secondsInSpace % 60

    val formatData = "%02d:%02d:%02d".format(hours, minutes, remainderSecondsFromMinutes)

    println(formatData)

}