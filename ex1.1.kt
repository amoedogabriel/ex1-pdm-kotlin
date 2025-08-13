fun main() {
    println("Digite seu nome:")
    val nome: String = readln()

    println("Digite sua idade:")
    var idade: Int = readln().toInt()

    println("Meu nome é $nome e tenho $idade anos")

    idade++

    println("Meu nome é $nome e agora tenho $idade anos")
}