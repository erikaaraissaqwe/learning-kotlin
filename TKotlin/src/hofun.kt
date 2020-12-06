fun main(){
    val x = "Ola"
    val b = "Mundo"

    println(processaText(x, b, ::concatena))
    println(processaText(x, b, ::inverte))

    println(
            processaText(x, b) {a, b ->
                "${a.decapitalize()},${b.decapitalize()}"
            }
    )

    var familia : List<String> = listOf("Erika", "Bel")

    familia.paraCadaString( ::primeiraLetra ).forEach{
        println(it)
    }

    familia.paraCadaString { it.last().toString() }.forEach { println(it) }

    familia.paraCada(::primeiraLetra).forEach{
        println(it)
    }

    val listInt : List<Int> = (1..10).toList()
    val listInc : List<Int> = listInt.paraCada(::incrementa)
    listInc.forEach { println(it) }

}

fun processaText(s1:String, s2:String, processa:(String, String) -> String):String{
    return processa(s1, s2)
}

fun concatena(a:String, b: String):String{
    return "$a$b"
}

fun inverte(a:String, b: String):String{
    return "${a.reversed()}${b.reversed()}"
}

fun List<String>.paraCadaString(funcao:(String) -> String): List<String>{
    val returnList : MutableList<String> = mutableListOf()

    for (s in this){
        returnList.add(funcao(s))
    }
    return returnList
}

fun primeiraLetra(s:String) : String = s.first().toString()

fun <T> List<T>.paraCada(funcao: (T) -> T) : List<T>{
    val returnList : MutableList<T> = mutableListOf()
    this.forEach { returnList.add(funcao(it)) }
    return returnList
}

fun incrementa(i:Int) = i +1

fun dobre(f: Float) = 2 * f