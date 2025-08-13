fun comprimentoOuZero(texto: String?): Int {
    return texto?.length ?: 0
}

fun main() {
    println("Digite uma palavra (ou pressione Enter para testar com nulo):")
    val entrada: String? = readln().ifEmpty { null }

    val tamanho = comprimentoOuZero(entrada)

    println("O comprimento da string é: $tamanho")
    println("Testando diretamente com o valor nulo: ${comprimentoOuZero(null)}")
}