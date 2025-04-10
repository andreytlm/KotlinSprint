package org.example.KotlinSprint_Lesson2

fun main() {
    val numberOfStaff = 50
    val staffSalary = 50000
    val numberOfIntern = 30
    val internSalary = 20000
    val expenditureOfStaff = numberOfStaff * staffSalary
    val expenditureOfAllStaff = (numberOfIntern * internSalary) + expenditureOfStaff
    val averageSalaryForAllStaff = expenditureOfAllStaff / (numberOfStaff + numberOfIntern)

    println(expenditureOfStaff)
    println(expenditureOfAllStaff)
    println(averageSalaryForAllStaff)
}