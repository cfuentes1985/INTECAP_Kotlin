package com.itgtxela.estructuras

fun main(){
    condicionesifelse()
    condicionwhen()
    ciclos()
}

fun condicionesifelse(){
    val edad = 20
    val numero1 = 10
    val numero2 = 5
    val numero = -3

    // 1. Verificar si una persona puede votar (mayor o igual a 18 años)
    if (edad >= 18) {
        println("La persona puede votar.")
    } else {
        println("La persona NO puede votar.")
    }

    // 2. Comparar dos números
    if (numero1 > numero2) {
        println("$numero1 es mayor que $numero2.")
    } else if (numero1 < numero2) {
        println("$numero1 es menor que $numero2.")
    } else {
        println("$numero1 es igual a $numero2.")
    }

    // 3. Verificar si un número es positivo o negativo
    if (numero > 0) {
        println("$numero es positivo.")
    } else if (numero < 0) {
        println("$numero es negativo.")
    } else {
        println("El número es cero.")
    }
}

fun condicionwhen(){
    val nota = 8

    val clasificacion = when (nota) {
        in 1..4 -> "Reprobado"
        5, 6 -> "Regular"
        7, 8 -> "Bueno"
        9, 10 -> "Aprobado"
        else -> "Nota inválida"
    }

    println("La nota $nota es: $clasificacion")
}

fun ciclos(){
    for (i in 1..100) {
        println(i)
    }

    var contador = 1
    while (contador <= 50) {
        println(contador)
        contador++
    }

    var intentos = 1
    do {
        println("Intento número $intentos")
        intentos++
    } while (intentos <= 5)

    val arreglo = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes")

    for (dia in arreglo) {
        println(dia)
    }

    val lista = listOf("Rojo", "Verde", "Azul", "Amarillo")

    for (color in lista) {
        println(color)
    }

}