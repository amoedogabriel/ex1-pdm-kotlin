fun main() {
    println("Digite um número inteiro:")
    val numero = readln().toInt()

    val resultado = if (numero > 0) {
        "Positivo"
    } else if (numero < 0) {
        "Negativo"
    } else {
        "Zero"
    }

    println("O número é $resultado")
}