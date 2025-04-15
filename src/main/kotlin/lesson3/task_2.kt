package lesson3

fun main() {
    var personalFirstSurname = "Андреева"
    val personalName = "Татьяна"
    val personalPatronymic = "Сергеевна"
    var age = 20

    println("$personalFirstSurname $personalName $personalPatronymic возраст = $age")

    personalFirstSurname = "Сидорова"
    age = 22

    println("$personalFirstSurname $personalName $personalPatronymic возраст = $age")
}