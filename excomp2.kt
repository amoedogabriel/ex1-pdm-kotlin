fun main() {
    var totalFeminino = 0
    var totalMasculino = 0
    var somaIdadeHomensComExperiencia = 0
    var totalHomensComExperiencia = 0
    var homensMaisDe45 = 0
    var mulheresMenosDe35ComExperiencia = 0
    var menorIdadeMulherComExperiencia = Int.MAX_VALUE
    val inscricaoMulheresItemE = mutableListOf<String>()

    while (true) {
        println("\nDigite o número de inscrição do candidato (ou 0 para sair):")
        val inscricao = readln()
        if (inscricao == "0") break

        println("Digite a idade do candidato:")
        val idade = readln().toInt()

        println("Digite o sexo (M para masculino, F para feminino):")
        val sexo = readln().uppercase()

        println("Possui experiência no serviço? (S para sim, N para não):")
        val experiencia = readln().uppercase()

        if (sexo == "F") {
            totalFeminino++
            if (idade < 35 && experiencia == "S") {
                mulheresMenosDe35ComExperiencia++
                inscricaoMulheresItemE.add(inscricao)
            }
            if (experiencia == "S" && idade < menorIdadeMulherComExperiencia) {
                menorIdadeMulherComExperiencia = idade
            }
        } else if (sexo == "M") {
            totalMasculino++
            if (idade > 45) {
                homensMaisDe45++
            }
            if (experiencia == "S") {
                totalHomensComExperiencia++
                somaIdadeHomensComExperiencia += idade
            }
        }
    }

    val idadeMediaHomensComExperiencia = if (totalHomensComExperiencia > 0)
        somaIdadeHomensComExperiencia.toDouble() / totalHomensComExperiencia else 0.0

    val percentagemHomensMais45 = if (totalMasculino > 0)
        homensMaisDe45.toDouble() * 100 / totalMasculino else 0.0
    
    val menorIdadeFemininoExperienciaStr = if (menorIdadeMulherComExperiencia == Int.MAX_VALUE) 
        "Nenhuma mulher com experiência" else menorIdadeMulherComExperiencia.toString()


    println("\n--- RESULTADO DO LEVANTAMENTO ---")
    println("a) Número de candidatos do sexo feminino: $totalFeminino")
    println("b) Número de candidatos do sexo masculino: $totalMasculino")
    System.out.printf("c) Idade média dos homens com experiência: %.1f anos\n", idadeMediaHomensComExperiencia)
    System.out.printf("d) Porcentagem de homens com mais de 45 anos: %.2f%%\n", percentagemHomensMais45)
    println("e) Número de mulheres com idade inferior a 35 anos e com experiência: $mulheresMenosDe35ComExperiencia")
    println("f) Menor idade entre as mulheres com experiência: $menorIdadeFemininoExperienciaStr")
    println("\nInscrição das mulheres com menos de 35 anos e com experiência: ${inscricaoMulheresItemE.joinToString(", ")}")
}