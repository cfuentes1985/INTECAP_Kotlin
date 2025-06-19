package com.itgtxela.actividadfundamentos

fun main() {
    tipoVariables()
    presentacion("Carlos","Fuentes")
    miapp()
    println("\nsuma: ${operacion(1,10.00,10.00)}")
    println("\ndivision: ${operacion(2,10.00,5.00)}")
    println("\nmultiplicacion: ${operacion(3,2.00,2.00,2.00)}")
}

fun tipoVariables(){
    // Variables inmutables
    // 1. Entero (Int)
    val edad: Int = 25
    println("1. Edad: $edad") // Resultado: 1. Edad: 25

    // 2. Decimal (Double)
    val pi: Double = 3.1416
    println("2. Pi: $pi") // Resultado: 2. Pi: 3.1416

    // 3. Cadena de texto (String)
    val nombre: String = "Ana"
    println("3. Nombre: $nombre") // Resultado: 3. Nombre: Ana

    // 4. Booleano (Boolean)
    val esActivo: Boolean = true
    println("4. Esta activo?: $esActivo") // Resultado: 4. ¿Está activo?: true

    // 5. Lista inmutable (List)
    val frutas: List<String> = listOf("Manzana", "Pera", "Uva")
    println("5. Frutas: $frutas") // Resultado: 5. Frutas: [Manzana, Pera, Uva]

    // 6. Array
    val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("6. Numeros: ${numeros.joinToString()}") // Resultado: 6. Números: 1, 2, 3, 4, 5

    // 7. Carácter (Char)
    val inicial: Char = 'A'
    println("7. Inicial: $inicial") // Resultado: 7. Inicial: A

    // 8. Flotante (Float)
    val temperatura: Float = 23.5f
    println("8. Temperatura: $temperatura") // Resultado: 8. Temperatura: 23.5

    // 9. Long
    val poblacionMundial: Long = 7_900_000_000
    println("9. Poblacion mundial: $poblacionMundial") // Resultado: 9. Población mundial: 7900000000

    // 10. Par (Pair)
    val coordenadas: Pair<Double, Double> = Pair(40.4168, -3.7038)
    println("10. Coordenadas: $coordenadas") // Resultado: 10. Coordenadas: (40.4168, -3.7038)

    // Variables mutables
    // 1. Entero (Int)
    var contador: Int = 0
    contador += 1
    println("1. Contador: $contador") // Resultado: 1. Contador: 1

    // 2. Decimal (Double)
    var precio: Double = 99.99
    precio *= 1.1 // Aumento del 10%
    println("2. Precio con IVA: $precio") // Resultado: 2. Precio con IVA: 109.989

    // 3. Cadena de texto (String)
    var mensaje: String = "Hola"
    mensaje += ", mundo!"
    println("3. Mensaje: $mensaje") // Resultado: 3. Mensaje: Hola, mundo!

    // 4. Booleano (Boolean)
    var conectado: Boolean = false
    conectado = !conectado
    println("4. Estado de conexion: $conectado") // Resultado: 4. Estado de conexión: true

    // 5. Lista mutable (MutableList)
    var tareas: MutableList<String> = mutableListOf("Estudiar", "Trabajar")
    tareas.add("Descansar")
    println("5. Tareas: $tareas") // Resultado: 5. Tareas: [Estudiar, Trabajar, Descansar]

    // 6. Mapa mutable (MutableMap)
    var usuarios: MutableMap<Int, String> = mutableMapOf(1 to "Juan", 2 to "María")
    usuarios[3] = "Carlos"
    println("6. Usuarios: $usuarios") // Resultado: 6. Usuarios: {1=Juan, 2=María, 3=Carlos}

    // 7. Carácter (Char)
    var letra: Char = 'B'
    letra++
    println("7. Siguiente letra: $letra") // Resultado: 7. Siguiente letra: C

    // 8. Flotante (Float)
    var peso: Float = 68.3f
    peso -= 2.5f
    println("8. Peso actualizado: $peso") // Resultado: 8. Peso actualizado: 65.8

    // 9. Short
    var diaMes: Short = 15
    diaMes = 20
    println("9. Dia del mes: $diaMes") // Resultado: 9. Día del mes: 20

    // 10. Conjunto mutable (MutableSet)
    var numerosUnicos: MutableSet<Int> = mutableSetOf(1, 2, 3)
    numerosUnicos.add(2) // No se agregará porque ya existe
    numerosUnicos.add(4)
    println("10. Numeros unicos: $numerosUnicos") // Resultado: 10. Números únicos: [1, 2, 3, 4]
}

fun presentacion(nombres: String, apellidos: String): String{
    var result: String = "Mi nombres es: $nombres, $apellidos y estoy en el curso de Kotlin"
    println("\n$result")
    return result
}

fun miapp(){
     println("\nKOTLIN")
}

fun operacion(operacion: Int, n1: Double, n2: Double, n3: Double? = null): Double{
    when(operacion){
        1 -> return  n1 + n2
        2 -> return  n1 / n2
        3 -> return  n1 * n2 * n3!!.toDouble()
        else -> throw IllegalArgumentException("Operación no válida: $operacion")
    }
}