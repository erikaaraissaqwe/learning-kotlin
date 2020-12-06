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