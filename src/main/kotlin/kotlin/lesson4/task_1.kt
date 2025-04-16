fun main() {
    var busyTable = 13

    println("Доступность столиков на сегодня: ${busyTable < NUMBER_OF_TABLES}")

    busyTable = 9

    println("Доступность столиков на завтра: ${busyTable < NUMBER_OF_TABLES}")
}

const val NUMBER_OF_TABLES = 13