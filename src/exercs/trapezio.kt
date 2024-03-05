package exercs

import kotlin.math.sqrt

fun main() {
    var baseM: Double? = null
    var baseMenor: Double? = null
    var altura: Double? = null

    // Solicita que o usuário insira a base maior do trapézio até que um valor válido seja fornecido
    while (baseM == null) {
        println("Digite a base maior do trapézio:")

        baseM = readLine()?.toDoubleOrNull()

        if (baseM == null) {
            println("Valor inválido. Por favor, digite um número válido para a base maior do trapézio.")
        }
    }

    // Solicita que o usuário insira a base menor do trapézio até que um valor válido seja fornecido
    while (baseMenor == null) {
        println("Digite a base menor do trapézio:")

        baseMenor = readLine()?.toDoubleOrNull()

        if (baseMenor == null) {
            println("Valor inválido. Por favor, digite um número válido para a base menor do trapézio.")
        }
    }

    // Solicita que o usuário insira a altura do trapézio até que um valor válido seja fornecido
    while (altura == null) {
        println("Digite a altura do trapézio:")

        altura = readLine()?.toDoubleOrNull()

        if (altura == null) {
            println("Valor inválido. Por favor, digite um número válido para a altura do trapézio.")
        }
    }

    // Calcula a área do trapézio
    var area = (baseM + baseMenor) * altura / 2

    // Exibe a área calculada
    println("A área do trapézio é: $area ")
}
