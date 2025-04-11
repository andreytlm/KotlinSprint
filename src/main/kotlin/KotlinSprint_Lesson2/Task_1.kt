package org.example.KotlinSprint_Lesson2

fun main() {
    val numberOfStudents = 4
    val gradeStudent1 = 3
    val gradeStudent2 = 4
    val gradeStudent3 = 3
    val gradeStudent4 = 5
    val averageScore =
        ((gradeStudent1.toFloat() + gradeStudent2.toFloat() + gradeStudent3.toFloat() + gradeStudent4.toFloat()) / numberOfStudents)

    println("Средний бал по английскому языку - $averageScore")
}