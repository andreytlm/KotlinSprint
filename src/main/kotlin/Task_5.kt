package KotlinSprint_Task5

fun main() {
    val secondsInSpace: Short = 6480
    val hours = secondsInSpace / SECONDS_IN_HOUR
    val remainderSecondsFromHours = secondsInSpace % SECONDS_IN_HOUR
    val minutes = remainderSecondsFromHours / SECONDS_IN_MINUTE
    val seconds = secondsInSpace % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600


