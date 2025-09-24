package com.example.appmovil.ui.theme

/*
fun main() {
    print("Introduce tu renta anual en euros: ")
    val renta = readLine()?.toDoubleOrNull()

    if (renta == null) {
        println("Entrada no válida. Por favor, introduce un número.")
        return
    }

    val tipoImpositivo = when {
        renta < 10000 -> 5
        renta in 10000.0..19999.99 -> 15
        renta in 20000.0..34999.99 -> 20
        renta in 35000.0..59999.99 -> 30
        else -> 45
    }

    println("Tu tipo impositivo es del $tipoImpositivo%.")
}

 */



fun main() {
    print("Introduce tu puntuación (0.0, 0.4, 0.6 o más): ")
    val entrada = readLine()?.toDoubleOrNull()

    if (entrada == null || (entrada != 0.0 && entrada != 0.4 && entrada < 0.6)) {
        println(" Puntuación inválida. Solo se permiten 0.0, 0.4 o 0.6 o más.")
        return
    }

    val salarioBase = 2400.0
    val nivel = when {
        entrada == 0.0 -> "Inaceptable"
        entrada == 0.4 -> "Aceptable"
        entrada >= 0.6 -> "Meritorio"
        else -> "x"
    }

    val dinero = salarioBase * entrada
    println(" Nivel: $nivel")
    println(" Dinero ganado: €$dinero")
}



/*
fun main() {
    print("Introduce la edad del cliente: ")
    val edad = readLine()?.toIntOrNull()

    if (edad == null || edad < 0) {
        println(" Edad inválida. Introduce un número positivo.")
        return
    }

    val precio = when {
        edad <= 4 -> 0
        edad in 4..18 -> 5
        else -> 10
    }

    println(" Edad: $edad años")
    println(" Precio de entrada: €$precio")
}

 */





