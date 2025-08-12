class Retangulo(val largura: Double, val altura: Double) {
    fun area(): Double = largura * altura
    fun perimetro(): Double = 2 * (largura + altura)
    fun tipo(): String = if (largura == altura) "Quadrado" else "Retângulo"
}

fun main() {
    val r1 = Retangulo(4.0, 4.0)
    val r2 = Retangulo(4.0, 5.0)

    println("r1 -> área: ${r1.area()}, perímetro: ${r1.perimetro()}, tipo: ${r1.tipo()}")
    println("r2 -> área: ${r2.area()}, perímetro: ${r2.perimetro()}, tipo: ${r2.tipo()}")
}
