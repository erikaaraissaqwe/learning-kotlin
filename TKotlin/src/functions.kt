fun main() {
    val x: Int =10
    println(x.multiplo2(23))
    println(multiplo(10, 2))
    println(x multiplo2 2)
    println(multiplo(400))
    println(multiplo(b = 400))
    println("${if (multiplo(10, 2)) "multiplo" else "não"}")


}

fun multiplo(a:Int=4000, b:Int=40):Boolean{
    return a % b == 0
}

infix fun Int.multiplo2(b:Int):Boolean{
    return multiplo(this, b)
}