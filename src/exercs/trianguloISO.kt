package exercs

import kotlin.math.sqrt

fun main() {
    var base: Double? = null
    var altura: Double? = null

    // Solicita que o usuário insira a base do triangulo até que um valor válido seja fornecido
    while (base == null) {
        println("Digite a base do triângulo:")

        base = readLine()?.toDoubleOrNull()

        if (base == null) {
            println("Valor inválido. Por favor, digite um número válido para a base do triângulo.")
        }
    }

    // Solicita que o usuário insira a altura do triangulo até que um valor válido seja fornecido
    while (altura == null) {
        println("Digite a altura do triângulo:")

        altura = readLine()?.toDoubleOrNull()

        if (altura == null) {
            println("Valor inválido. Por favor, digite um número válido para a altura do triângulo.")
        }
    }

    // Calcula a área do triangulo
    val area = base * altura / 2

    // Exibe a área calculada
    println("A área do triângulo isósceles é: $area")
}