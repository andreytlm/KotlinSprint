package org.example.KotlinSprint_Lesson2

fun main() {
    val numberOfStudents: Float = 4.00f
    val gradeStudent1: Float = 3.00f
    val gradeStudent2: Float = 4.00f
    val gradeStudent3: Float = 3.00f
    val gradeStudent4: Float = 5.00f
    val averageScore: Float = ((gradeStudent1+gradeStudent2+gradeStudent3+gradeStudent4)/numberOfStudents)
    println("Средний бал по английскому языку - $averageScore")

}