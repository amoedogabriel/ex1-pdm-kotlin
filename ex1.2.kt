fun verificaNumero(n: Int): String =
    if (n > 0) "Positivo" else if (n < 0) "Negativo" else "Zero"


fun main() {
    println(verificaNumero(10))   
    println(verificaNumero(-3))   
    println(verificaNumero(0))    
}
