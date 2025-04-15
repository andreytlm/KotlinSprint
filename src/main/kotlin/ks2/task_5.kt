package ks2

fun main() {
    val clientMoney = 70000
    val interestRate = 16.7
    val durationOfDepositYears = 20
    val depositIncome = ((clientMoney * interestRate * durationOfDepositYears) / TO_PROCENT) + clientMoney

    println("%.3f".format(depositIncome))
}
const val TO_PROCENT = 100