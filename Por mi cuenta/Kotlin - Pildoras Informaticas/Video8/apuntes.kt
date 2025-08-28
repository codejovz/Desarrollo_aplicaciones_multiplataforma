//1er arg = 'hola mundo cruel'
fun main(args:Array<String>) {

    println(args[2])  // => cruel

}

//2º arg = 5 10 15 20
fun main(args:Array<String>) {
    //Los argumentos son Strings porque se lo hemos especificado

    val numeros=args.map{it.toInt()}.toIntArray()
    
    val suma = numeros.sum()
    
    println("Has introducido ${numeros.size} numeros") // => Has introducido 4 numeros 
    
    for (numero in numeros){
        
        println("Numero: $numero")
        
    }
    
     println("La suma de los valores es: $suma") // => La suma de los valores es: 50

}