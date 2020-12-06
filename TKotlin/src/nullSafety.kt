fun main(){

    var name : String = "Erika"

    var sobrenome : String?
    sobrenome=null

    var sn : String
    sn = sobrenome ?: "Bueno"
    println("$name  $sn")
}