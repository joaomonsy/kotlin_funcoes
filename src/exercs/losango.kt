package exercs

import kotlin.math.sqrt

fun main() {
    var DiagM: Double? = null
    var Diagmenor: Double? = null

    // Solicita que o usuário insira a DiagM do losango até que um valor válido seja fornecido
    while (DiagM == null) {
        println("Digite a diagonal maior do losango:")

        DiagM = readLine()?.toDoubleOrNull()

        if (DiagM == null) {
            println("Valor inválido. Por favor, digite um número válido para a diagonal maior do losango.")
        }
    }

    // Solicita que o usuário insira a Diagonal menor do losango até que um valor válido seja fornecido
    while (Diagmenor == null) {
        println("Digite a diagonal menor do losango:")

        Diagmenor = readLine()?.toDoubleOrNull()

        if (Diagmenor == null) {
            println("Valor inválido. Por favor, digite um número válido para a diagonal menor do losango.")
        }
    }

    // Calcula a área do losango
    val area = DiagM * Diagmenor / 2

    // Exibe a área calculada
    println("A área do losango é: $area cm²")
}