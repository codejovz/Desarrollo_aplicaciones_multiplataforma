fun main() {
    
    var edadJuan:Int=21                //variable mutable
    
    val nombrePersona:String="Jorge"   //variable inmutable (final en Java)
    
    const val constante:String="Constante"
    
    //nombrePersona="Pedro"   //'val' cannot be reassigned.
    println("El nombre de la persona es: $nombrePersona")
    
    
    println("La edad de Juan es: " + edadJuan)
    
    println("Un año despues...")
    
    edadJuan++
    
    print("La edad de juan ahora es: " + edadJuan)
    println(" | otro mensaje, no ha hecho salto de linea")
    
    println("La edad de juan con String templates: $edadJuan")
    
    println(String.format("La edad de Juan con Format: %d", edadJuan))  //Usando la funcion 'Format' perteneciente a la clase String
    
    println("La edad de juan con toString: " + edadJuan.toString())
    
    println("La edad de juan con fun y templates: ${devolverEdad()}")
    
}

fun devolverEdad():Int{
    return 25
}