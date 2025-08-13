data class AlunoAvaliado(
    val matricula: String,
    val frequencia: Int,
    val notaFinal: Double,
    val situacao: String
)

fun main() {
    val alunos = mutableListOf<AlunoAvaliado>()
    var maiorNota = Double.MIN_VALUE
    var menorNota = Double.MAX_VALUE
    var somaNotasTurma = 0.0
    var totalReprovados = 0
    var reprovadosPorInfrequencia = 0
    val totalAlunos = 100 

    for (i in 1..totalAlunos) {
        println("\n--- Aluno $i ---")
        println("Digite o número de matrícula:")
        val matricula = readln()

        println("Digite a primeira nota:")
        val nota1 = readln().toDouble()

        println("Digite a segunda nota:")
        val nota2 = readln().toDouble()

        println("Digite a terceira nota:")
        val nota3 = readln().toDouble()

        println("Digite o número de aulas frequentadas:")
        val frequencia = readln().toInt()

        val notaFinal = (nota1 + nota2 + nota3) / 3.0
        somaNotasTurma += notaFinal

        if (notaFinal > maiorNota) maiorNota = notaFinal
        if (notaFinal < menorNota) menorNota = notaFinal

        val aprovado = notaFinal >= 60 && frequencia >= 40
        val situacao = if (aprovado) "Aprovado" else "Reprovado"

        if (!aprovado) {
            totalReprovados++
            if (frequencia < 40) {
                reprovadosPorInfrequencia++
            }
        }
        
        alunos.add(AlunoAvaliado(matricula, frequencia, notaFinal, situacao))
    }

    val notaMediaTurma = somaNotasTurma / totalAlunos
    val percentualReprovadosInfrequencia = if (totalReprovados > 0)
        reprovadosPorInfrequencia.toDouble() * 100 / totalReprovados else 0.0

    println("\n\n--- RESULTADOS INDIVIDUAIS ---")
    for (aluno in alunos) {
        System.out.printf(
            "Matrícula: %s, Frequência: %d, Nota Final: %.2f, Situação: %s\n",
            aluno.matricula, aluno.frequencia, aluno.notaFinal, aluno.situacao
        )
    }

    println("\n\n--- ESTATÍSTICAS DA TURMA ---")
    System.out.printf("Maior nota da turma: %.2f\n", maiorNota)
    System.out.printf("Menor nota da turma: %.2f\n", menorNota)
    System.out.printf("Nota média da turma: %.2f\n", notaMediaTurma)
    println("Total de alunos reprovados: $totalReprovados")
    System.out.printf("Porcentagem de alunos reprovados por infrequência: %.2f%%\n", percentualReprovadosInfrequencia)
}