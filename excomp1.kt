fun main() {
    println("Digite o valor do salário mínimo:")
    val salarioMinimo = readln().toDouble()

    println("Digite o limite de isenção do Imposto de Renda:")
    val limiteIsencaoIR = readln().toDouble()

    println("Digite o preço do televisor a cores:")
    val precoTvCor = readln().toDouble()

    println("Digite o preço do televisor preto e branco:")
    val precoTvPB = readln().toDouble()

    for (i in 1..20) {
        println("\n--- Comerciário $i ---")
        println("Digite o número de inscrição do comerciário:")
        val inscricao = readln()

        println("Digite o número de televisores a cores vendidos:")
        val numTvCor = readln().toInt()

        println("Digite o número de televisores preto e branco vendidos:")
        val numTvPB = readln().toInt()

        val comissaoCor = if (numTvCor >= 10) numTvCor * precoTvCor * 0.14 else numTvCor * precoTvCor * 0.13
        val comissaoPB = if (numTvPB >= 20) numTvPB * precoTvPB * 0.13 else numTvPB * precoTvPB * 0.12

        val salarioBruto = salarioMinimo + comissaoCor + comissaoPB
        val descontoINSS = salarioBruto * 0.08
        val baseCalculoIR = salarioBruto - descontoINSS

        val descontoIR = if (baseCalculoIR > limiteIsencaoIR) (baseCalculoIR - limiteIsencaoIR) * 0.15 else 0.0

        val salarioLiquido = baseCalculoIR - descontoIR

        println("\n--- Resultados para o Comerciário $inscricao ---")
        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto)
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido)
    }
}