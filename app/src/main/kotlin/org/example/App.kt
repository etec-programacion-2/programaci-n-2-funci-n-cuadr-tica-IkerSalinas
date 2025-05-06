
package org.example
fun main() {
    // Coeficientes
    val a = 1
    val b = -3
    val c = 2

    // Validación de 'a'
    if (a == 0) {
        println("El coeficiente 'a' no puede ser cero.")
        return
    }

    // Mostrar la función en formato ax² + bx + c
    println("La función es: $a x² + $b x + $c")

    // Calcular y mostrar la tabla de valores
    println("\nTabla de valores para la función f(x) = $a x² + $b x + $c:")
    println("x \t\t f(x)")
    for (x in -5..5) {
        val resultado = calcularFuncion(x, a, b, c)
        println("$x \t\t $resultado")
    }

    // Calcular y mostrar las raíces
    println("\nAnálisis de las raíces:")
    val resultadoRaices = calcularRaices(a, b, c)
    println(resultadoRaices)
}

fun calcularFuncion(x: Int, a: Int, b: Int, c: Int): Int {
    return a * x * x + b * x + c
}

fun calcularDiscriminante(a: Int, b: Int, c: Int): Double {
    return (b * b - 4 * a * c).toDouble()
}
fun calcularRaices(a: Int, b: Int, c: Int): String {
    val discriminante = calcularDiscriminante(a, b, c)
    val denominador = 2.0 * a

    return when {
        discriminante > 0 -> { // Dos raíces reales y distintas
            val raizDiscriminante = discriminante // ya está calculado el discriminante
            val raiz1 = (-b + raizDiscriminante) / denominador
            val raiz2 = (-b - raizDiscriminante) / denominador
            "Raíces reales y distintas: x1 = %.2f, x2 = %.2f".format(raiz1, raiz2)
        }
        discriminante == 0.0 -> { // Una raíz real doble
            val raiz = -b / denominador
            "Raíz real doble: x = %.2f".format(raiz)
        }
        else -> { // Raíces complejas
            val parteReal = -b / denominador
            val parteImaginaria = Math.abs(discriminante) / denominador // Usamos el valor absoluto de la parte negativa
            "Raíces complejas: x1 = %.2f + %.2fi, x2 = %.2f - %.2fi".format(parteReal, parteImaginaria, parteReal, parteImaginaria)
        }
    }
}
