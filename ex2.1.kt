fun ehPar(numero: Int): Boolean = numero % 2 == 0

fun main() {
    println("Digite um número inteiro para verificar se é par:")
    val numero = readln().toInt()

    val resultado = if (ehPar(numero)) "é par" else "é ímpar"

    println("O número $numero $resultado.")
}