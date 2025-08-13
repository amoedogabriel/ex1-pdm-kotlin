fun String.inverte(): String = this.reversed()

fun main() {
    println("Digite um texto para inverter:")
    val texto = readln()
    
    val textoInvertido = texto.inverte()

    println("O texto invertido é: $textoInvertido")
}