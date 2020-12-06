fun main() {
    var number1 = 10
    var number2 = 25

    println(soma(number1, number2))

    println(multiplica(number2, number1))

    number1 = multiplica(number2, number1)

    println(number1)

    println(raizQuadrada(number1))

    println(processaInteiro(number2, ::raizQuadrada))

    println(processaInteiros(number1, number2, ::multiplica))

    number2 = processaInteiro(number2, ::raizQuadrada)

    println(number2)

    println(processaInteiros(number1, number2, ::multiplica))
}

// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int{
    return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int{
    return f(i, j)
}
// Funções
fun soma(i: Int, j: Int): Int{
    return i + j
}
fun multiplica(i: Int, j: Int): Int{
    return i * j
}
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}
