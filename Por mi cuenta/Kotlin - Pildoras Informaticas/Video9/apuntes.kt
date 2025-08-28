class Persona(val nombre:String){
    
    override fun toString():String{
        return "Nombre: $nombre"
    }
    
}

fun dameTipo(obj:Any):Any{
    
    return obj::class.simpleName?:"Desconocido"
}


fun main() {
    
    val numero:Any = 2
    println("numero: $numero") //numero: 2
    
    val numeroFlotante:Any = 12.12
    println("numeroFlotante: $numeroFlotante") // numeroFlotante: 12.12
    
    //val nulo:Any = null
    //println(nulo) // Null cannot be a value of a non-null type 'kotlin.Any'.
    
    val p1:Any = Persona("Jorge")
    println("p1: $p1") // Sin el override devuelve hashcode,
    println("p1.toString(): ${p1.toString()}") //con el override devuelve lo del return
    
    
    println(dameTipo(10))  // Int
}