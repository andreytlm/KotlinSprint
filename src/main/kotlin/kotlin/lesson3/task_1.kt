fun main() {
    val userName = "Имя клиента"
    val dayGreeting = "Добрый день"
    val eveningGreeting = "Добрый вечер"
    var greetingOnScreen = "$dayGreeting, $userName!"

    println(greetingOnScreen)

    greetingOnScreen = "$eveningGreeting, $userName!"

    println(greetingOnScreen)
}