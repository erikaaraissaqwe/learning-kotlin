fun main(){

    val numString : String = 10.toString()


    val any:Any = "Any yayan"

    val string : String? = any as? String


    if (any is String){
        println(any.capitalize())
    }


}
