fun main() {
    var numFeminino = 0
    var numMasculino = 0
    var somaIdadeHomensComExp = 0
    var contHomensComExp = 0
    var contHomens = 0
    var contHomensMaior45 = 0
    var mulheresMenor35ComExp = 0
    val inscricoesMulheresMenor35 = mutableListOf<Int>()
    var menorIdadeMulheresComExp: Int? = null

    while (true) {
        print("Inscrição (0 encerra): ")
        val inscricao = readLine()!!.toInt()
        if (inscricao == 0) break

        print("Idade: "); val idade = readLine()!!.toInt()
        print("Sexo (M/F): "); val sexo = readLine()!!.trim().uppercase()
        print("Experiência? (S/N): "); val exp = readLine()!!.trim().uppercase()

        if (sexo == "F") {
            numFeminino++
            if (exp == "S") {
                if (idade < 35) {
                    mulheresMenor35ComExp++
                    inscricoesMulheresMenor35.add(inscricao)
                }
                menorIdadeMulheresComExp =
                    if (menorIdadeMulheresComExp == null) idade
                    else if (idade < menorIdadeMulheresComExp!!) idade else menorIdadeMulheresComExp
            }
        } else if (sexo == "M") {
            numMasculino++
            contHomens++
            if (idade > 45) contHomensMaior45++
            if (exp == "S") {
                contHomensComExp++
                somaIdadeHomensComExp += idade
            }
        }
    }

    val mediaIdadeHomensExp = if (contHomensComExp > 0) somaIdadeHomensComExp.toDouble() / contHomensComExp else 0.0
    val percHomensMaior45 = if (contHomens > 0) contHomensMaior45.toDouble() * 100 / contHomens else 0.0

    println("\n=== RESULTADOS ===")
    println("Feminino: $numFeminino")
    println("Masculino: $numMasculino")
    println("Idade média homens com exp: %.2f".format(mediaIdadeHomensExp))
    println("Homens >45 (%): %.2f%%".format(percHomensMaior45))
    println("Mulheres <35 com exp: $mulheresMenor35ComExp")
    println("Inscrições (mulheres <35 com exp): ${inscricoesMulheresMenor35.joinToString(", ").ifEmpty { "Nenhuma" }}")
    println("Menor idade mulher com exp: ${menorIdadeMulheresComExp ?: "Nenhuma"}")
}
