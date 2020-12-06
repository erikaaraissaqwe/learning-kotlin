fun main(){
    val n1: Int = processaInteiro(10, ::inverte)
    val n2 : Int = processaInteiro(11, {x:Int -> 2*x})
    val n3 : Int = processaInteiro(11) { x: Int -> 2 * x }
    val n4 : Int = processaInteiro(12, {3*it})
    val n5 : Int = processaInteiro(12) { 3 * it }
    println("${n1}, ${n2}, ${n3}, ${n4}, ${n5}")

    val n6 : Int = 16.executa {it * it}
    println(n6)

    val n7 : Int = 16.executa() {it * it}
    println(n7)


}

fun processaInteiro(i:Int, f: (j:Int) -> Int): Int{
    return f(i)
}

fun inverte(x:Int) = x * -1

fun Int.executa(f:(Int)->Int) = f(this)


