fun main() {
    // Caso 1
    val tiempoHoy1 = 300
    val tiempoAyer1 = 250

    println("¿Estuvo más tiempo en el celular hoy que ayer? ${estuvoMasTiempoEnElCelular(tiempoHoy1, tiempoAyer1)}")


    // Caso 2
    val tiempoHoy2 = 300
    val tiempoAyer2 = 300
    
    println("¿Estuvo más tiempo en el celular hoy que ayer? ${estuvoMasTiempoEnElCelular(tiempoHoy2, tiempoAyer2)}")


    // Caso 3
    val tiempoHoy3 = 200
    val tiempoAyer3 = 220
    
    println("¿Estuvo más tiempo en el celular hoy que ayer? ${estuvoMasTiempoEnElCelular(tiempoHoy3, tiempoAyer3)}")
}

fun estuvoMasTiempoEnElCelular (tiempoHoy: Int, tiempoAyer: Int): Boolean {
    return tiempoHoy > tiempoAyer
}