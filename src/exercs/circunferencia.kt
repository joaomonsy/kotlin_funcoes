package exercs

import kotlin.math.sqrt

fun main() {
    var raio: Double? = null

    // Solicita que o usuário insira o raio da circunferencia até que um valor válido seja fornecido
    while (raio == null) {
        println("Digite o raio do circunferencia:")

        raio = readLine()?.toDoubleOrNull()

        if (raio == null) {
            println("Valor inválido. Por favor, digite um número válido para o raio da circunferencia.")
        }
    }

    // Calcula a área da circunferencia
    val area = Math.PI * raio * raio

    // Exibe a área calculada
    println("A área da circunferencia é: $area")
}