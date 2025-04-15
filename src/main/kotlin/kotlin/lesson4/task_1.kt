fun main() {
    var busyTable = 13
    var compasionTables: Boolean = !(busyTable >= NUMBER_OF_TABLES)

    println("Доступность столиков на сегодня: $compasionTables")

    busyTable = 9
    compasionTables = !(busyTable >= NUMBER_OF_TABLES)

    println("Доступность столиков на завтра: $compasionTables")
}

const val NUMBER_OF_TABLES = 13