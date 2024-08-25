fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result1 = add(firstNumber, secondNumber)
    val anotherResult1 = add(firstNumber, thirdNumber)

    val result2 = subtract(firstNumber, secondNumber)
    val anotherResult2 = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result1")
    println("$firstNumber + $thirdNumber = $anotherResult1")

    println("$firstNumber - $secondNumber = $result2")
    println("$firstNumber - $thirdNumber = $anotherResult2")

}

// Definición de la función add
fun add(a: Int, b: Int): Int {
    return a + b
}

// Definición de la función subtract
fun subtract(a: Int, b: Int): Int {
    return a - b
}