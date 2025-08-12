fun comprimentoOuZero(s: String?): Int = s?.length ?: 0

fun main() {
    println(comprimentoOuZero("abc")) 
    println(comprimentoOuZero(null)) 
}
