class Retangulo(val largura: Double, val altura: Double) {
    fun calculaArea(): Double = largura * altura

    fun calculaPerimetro(): Double = 2 * (largura + altura)

    fun tipo(): String = if (largura == altura) "Quadrado" else "Retângulo"
}

fun main() {
    println("Digite a largura do retângulo:")
    val largura = readln().toDouble()

    println("Digite a altura do retângulo:")
    val altura = readln().toDouble()

    val retangulo = Retangulo(largura, altura)

    println("Tipo: ${retangulo.tipo()}")
    println("Área: ${retangulo.calculaArea()}")
    println("Perímetro: ${retangulo.calculaPerimetro()}")
}