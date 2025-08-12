data class Aluno(
    val nome: String,
    val matricula: String,
    val notas: List<Double>
) {
    fun media(): Double = if (notas.isNotEmpty()) notas.average() else 0.0
}

fun main() {
    val aluno = Aluno("Ana", "2025001", listOf(70.0, 80.0, 90.0))
    println("${aluno.nome} - Média: ${aluno.media()}")
}
