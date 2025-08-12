fun descreveEndereco(rua: String?, numero: Int?, cidade: String?): String {
    val r = rua ?: "Não informado"
    val n = numero?.toString() ?: "Não informado"
    val c = cidade ?: "Não informado"
    return "Rua $r, Nº $n, $c"
}

fun main() {
    println(descreveEndereco("Av. Brasil", 123, "Manaus"))
    println(descreveEndereco(null, null, "Manaus"))
}
