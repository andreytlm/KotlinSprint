package org.example.KotlinSprint_Lesson2

fun main() {
    val numberOfStudents = 4.00f
    val gradeStudent1 = 3.00f
    val gradeStudent2 = 4.00f
    val gradeStudent3 = 3.00f
    val gradeStudent4 = 5.00f
    val averageScore = ((gradeStudent1 + gradeStudent2 + gradeStudent3 + gradeStudent4) / numberOfStudents)

    println("Средний бал по английскому языку - $averageScore")
}