fun descreveEndereco(rua: String?, numero: Int?, cidade: String?): String {
    val ruaInfo = rua ?: "Não informado"
    val numeroInfo = numero?.toString() ?: "Não informado"
    val cidadeInfo = cidade ?: "Não informado"
    
    return "Rua $ruaInfo, Nº $numeroInfo, $cidadeInfo"
}

fun main() {
    println("Digite o nome da rua (ou Enter para pular):")
    val rua = readln().ifBlank { null }

    println("Digite o número (ou Enter para pular):")
    val numero = readln().toIntOrNull()

    println("Digite a cidade (ou Enter para pular):")
    val cidade = readln().ifBlank { null }

    println(descreveEndereco(rua, numero, cidade))
}