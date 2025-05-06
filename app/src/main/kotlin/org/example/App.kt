
package org.example

fun main() {

    val a = 2
    val b = 4
    val c = 6


    if (a == 0) {
        println("a no puede ser cero.")
        return
    }

    println("La función es: $a x² + $b x + $c")
    println("x \t\t f(x)")
    for (x in -5..5) {
        val resultado = calcularFuncion(x, a, b, c)

        println("$x \t\t $resultado")
    }
}

fun calcularFuncion(x: Int, a: Int, b: Int, c: Int): Int {
    return a * x * x + b * x + c
}

