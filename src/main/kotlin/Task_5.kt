package KotlinSprint_Task5

fun main() {
    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}

val secondsInSpace: Short = 6480
val hours = secondsInSpace / 3600
val remainderSecondsFromHours = secondsInSpace % 3600
val minutes = remainderSecondsFromHours / 60
val seconds = secondsInSpace % 60