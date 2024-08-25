fun main() {
    mostrarPronosticoPorCiudad("Ankara", 27, 31, 82)
    mostrarPronosticoPorCiudad("Tokyo", 32, 36, 10)
    mostrarPronosticoPorCiudad("Cape Town", 59, 64, 2)
    mostrarPronosticoPorCiudad("Guatemala City", 50, 55, 7)
}

fun mostrarPronosticoPorCiudad (ciudad: String, temperaturaMin: Int, temperaturaMax: Int, probabilidadDeLluvia: Int) {
    println("City: $ciudad")
    println("Low temperature: $temperaturaMin, High temperature: $temperaturaMax")
    println("Chance of rain: $probabilidadDeLluvia%")
    println()
}