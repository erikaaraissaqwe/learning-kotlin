fun main() {

    val familia : List<String> = listOf("Erika", "Bel")

    for(integrantes in familia){
        println(integrantes)
    }

    val listInt:List<Int> = listOf(0,1,2,3,4,5,6,7,8,9,10)

    for (num in listInt){
        println(listInt[num])
    }


    val listInt2:List<Int> = (1..10).toList()
    println((1..10).javaClass)

    for (i in 0..9){
        println(listInt2[i])
    }

    val listInt3:List<Int> = (1..10 step 2).toList()
    print((1..10 step 2).javaClass)

    for (i in 0 until listInt3.size){
        println(listInt3[i])
    }
    println("print com for each")
    listInt3.forEach{num -> println("elemento:  ${num}")}

    val listCursos: MutableList<String> = mutableListOf(
            "ADS",
            "SDM",
            "TPG"
    )

    listCursos.add("TMA")

    listCursos.forEach{println(it)}

    val familiaMap: MutableMap<String, String> = mutableMapOf(
            Pair("Mãe", "Bel"),
            Pair("Filha", "erika")
    )

    familiaMap["Aiai"] = "uiui"

    familiaMap.keys.forEach{ println("${it}   :  ${familiaMap[it]}")}
}