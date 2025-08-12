fun main() {
    val total = 100
    data class Aluno(val matricula: String, val freq: Int, val final: Double, val aprovado: Boolean)

    var maiorNota = Double.MIN_VALUE
    var menorNota = Double.MAX_VALUE
    var somaNotas = 0.0
    var reprovados = 0
    var reprovadosPorFalta = 0

    val alunos = List(total) { i ->
        println("---- Aluno ${i + 1} ----")
        print("Matrícula: "); val mat = readLine()!!.trim()
        print("Nota 1: "); val n1 = readLine()!!.toDouble()
        print("Nota 2: "); val n2 = readLine()!!.toDouble()
        print("Nota 3: "); val n3 = readLine()!!.toDouble()
        print("Frequência: "); val freq = readLine()!!.toInt()

        val final = (n1 + n2 + n3) / 3.0
        maiorNota = if (final > maiorNota) final else maiorNota
        menorNota = if (final < menorNota) final else menorNota
        somaNotas += final

        val aprovado = final >= 60 && freq >= 40
        if (!aprovado) {
            reprovados++
            if (freq < 40) reprovadosPorFalta++
        }

        Aluno(mat, freq, final, aprovado)
    }

    val mediaTurma = somaNotas / total
    val percReprovPorFalta = reprovadosPorFalta.toDouble() * 100 / total

    println("\n=== RESULTADOS POR ALUNO ===")
    alunos.forEach {
        println("Matrícula: ${it.matricula} | Freq: ${it.freq} | Nota: %.2f | %s"
            .format(it.final, if (it.aprovado) "Aprovado" else "Reprovado"))
    }

    println("\n=== RESUMO ===")
    println("Maior nota: %.2f".format(maiorNota))
    println("Menor nota: %.2f".format(menorNota))
    println("Média da turma: %.2f".format(mediaTurma))
    println("Total reprovados: $reprovados")
    println("Reprovados por falta (%): %.2f%%".format(percReprovPorFalta))
}
