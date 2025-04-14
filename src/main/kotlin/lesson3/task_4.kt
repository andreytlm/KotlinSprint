package lesson3

fun main() {
    var startMove = "E2"
    var endMove = "E4"
    var counterOfMoves = 1

    println("$startMove-$endMove, number of move = $counterOfMoves")

    startMove = "D2"
    endMove = "D${startMove[1].toString().toInt() + 1}"
    counterOfMoves ++

    println("$startMove-$endMove, number of move = $counterOfMoves")
    }