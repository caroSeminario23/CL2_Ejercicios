fun main() {

    // Caso 1
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()


    // Caso 2
    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()


    // Caso 3
    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}


// Función que muestra un mensaje de alerta
fun displayAlertMessage(operatingSystem: String = "Unknown OS" , emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}