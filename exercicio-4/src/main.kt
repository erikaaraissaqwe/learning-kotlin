fun main() {
    println(xpto(2, 3) { i, j -> soma(i as Int, j as Int) })
    println(xpto("Jo", "ão") { i, j -> cat(i as String, j as String) })
}
fun soma(i: Int, j: Int) = i + j

fun cat(i: String, j: String): String = "${i}${j}"

fun xpto( v1 : Any, v2 : Any, funcao:(Any, Any)->Any) : Any{
    return funcao(v1, v2)
}