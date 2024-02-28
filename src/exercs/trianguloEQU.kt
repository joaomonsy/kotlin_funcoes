package exercs

import kotlin.math.sqrt

fun main() {
    var lado: Double? = null

    // Solicita que o usuário insira o lado do triangulo até que um valor válido seja fornecido
    while (lado == null) {
        println("Digite o lado do triângulo:")

        lado = readLine()?.toDoubleOrNull()

        if (lado == null) {
            println("Valor inválido. Por favor, digite um número válido para a base do triângulo.")
        }
    }

    // Calcula a área do triangulo
    val area = lado * lado * sqrt(3.0) / 4

    // Exibe a área calculada
    println("A área do triângulo equilátero é: $area")
}