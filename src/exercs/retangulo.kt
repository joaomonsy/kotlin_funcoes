fun main() {
    var base: Double? = null
    var altura: Double? = null

    // Solicita que o usuário insira a base do retângulo até que um valor válido seja fornecido
    while (base == null) {
        println("Digite a base do retângulo:")

        base = readLine()?.toDoubleOrNull()

        if (base == null) {
            println("Valor inválido. Por favor, digite um número válido para a base do retângulo.")
        }
    }

    // Solicita que o usuário insira a altura do retângulo até que um valor válido seja fornecido
    while (altura == null) {
        println("Digite a altura do retângulo:")

        altura = readLine()?.toDoubleOrNull()

        if (altura == null) {
            println("Valor inválido. Por favor, digite um número válido para a altura do retângulo.")
        }
    }

    // Calcula a área do retângulo
    val area = base * altura

    // Exibe a área calculada
    println("A área do retângulo é: $area")
}