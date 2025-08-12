fun main() {
    println("Salário mínimo:"); val salarioMin = readLine()!!.toDouble()
    println("Limite de isenção do IRRF:"); val limiteIR = readLine()!!.toDouble()
    println("Preço TV a cores:"); val precoCores = readLine()!!.toDouble()
    println("Preço TV preto e branco:"); val precoPB = readLine()!!.toDouble()

    val totalEmpregados = 20
    data class Resultado(val inscricao: Int, val bruto: Double, val liquido: Double)

    val resultados = List(totalEmpregados) { i ->
        println("---- Empregado ${i + 1} ----")
        print("Número de inscrição: "); val inscricao = readLine()!!.toInt()
        print("TVs a cores vendidas: "); val nCores = readLine()!!.toInt()
        print("TVs PB vendidas: "); val nPB = readLine()!!.toInt()

        val comissaoCores = precoCores * nCores * if (nCores >= 10) 0.14 else 0.13
        val comissaoPB = precoPB * nPB * if (nPB >= 20) 0.13 else 0.12
        val bruto = salarioMin + comissaoCores + comissaoPB
        val aposINSS = bruto - bruto * 0.08
        val liquido = aposINSS - if (aposINSS > limiteIR) (aposINSS - limiteIR) * 0.15 else 0.0

        Resultado(inscricao, bruto, liquido)
    }

    println("\n=== RESULTADOS ===")
    resultados.forEach {
        println("Inscrição: ${it.inscricao} | Bruto: %.2f | Líquido: %.2f"
            .format(it.bruto, it.liquido))
    }
}
