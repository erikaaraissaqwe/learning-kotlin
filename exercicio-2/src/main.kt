fun main(){
    val familiaMap: MutableMap<String, String> = mutableMapOf(
        Pair("Pai", "Pedro"),
        Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca"))

    printMap(familiaMap)
}

fun printMap(map : MutableMap<String, String>){
    map.keys.forEach{ println("$it   :  ${map[it]}")}
}