fun main() {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))
}

fun soma(i: Int, j: Int) = i + j

fun cat(i: String, j: String): String = "${i}${j}"

fun foo(number1 : Int, number2 : Int, funcao:(Int, Int) -> Int):Int{
    return funcao(number1, number2)
}

fun bar(str1 : String, str2 : String, funcao:(String, String) ->String) : String{
    return funcao(str1, str2)
}

