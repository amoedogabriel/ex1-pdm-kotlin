data class Aluno(
    val nome: String,
    val matricula: String,
    val notas: List<Double>
) {
    fun calcularMedia(): Double {
        return if (notas.isEmpty()) 0.0 else notas.average()
    }
}

fun main() {
    println("Digite o nome do aluno:")
    val nome = readln()

    println("Digite a matrícula do aluno:")
    val matricula = readln()

    println("Digite as notas do aluno separadas por vírgula (ex: 7.5,8.0,9.5):")
    val notasStr = readln()
    val notas = notasStr.split(',').map { it.trim().toDouble() }

    val aluno = Aluno(nome, matricula, notas)

    println("Dados do Aluno: $aluno")
    println("Média do Aluno: ${aluno.calcularMedia()}")
}