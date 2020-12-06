fun main(){
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desevolvimento de Sistemas")


    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")
    listaCursos.add("Sistemas de Aeronaves")
    listaCursos.add("Técnico em Sistemas")
    listaCursos.add("Processos de Sistemas")


    val listaAtualizada: MutableList<String> = isSistemaInArray(listaCursos)
    var int = 0;
    listaAtualizada.forEach {
        println("${int++} - ${it}")
    }
}

fun isSistemaInArray(str : List<String>): MutableList<String> {
    val listaAtualizada : MutableList<String> = mutableListOf()
    for (frase in str){
        var string = frase.split(" ")
        if (string.contains("Sistemas")){
            listaAtualizada.add(frase)
        }

    }
    return listaAtualizada
}
