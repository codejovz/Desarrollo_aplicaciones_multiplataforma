fun main() {
    
    val miArray:Array<Int> = arrayOf(0, 1, 2, 4)
    
    val miArray2 = Array(5){15}
    
    println(miArray2[2])
    
    
    miArray2[2]= 4
    
    println(miArray2.joinToString())
    
    val miArray3=intArrayOf(1,5,7)
    
    println(miArray3.joinToString())
    
    //lateinit val miArray4:Array<String> //'lateinit' modifier is allowed only on mutable properties.

    lateinit var miArray5:Array<String>
    //println(miArray5.joinToString())  //lateinit property miArray5 has not been initialized
    
    miArray5=arrayOf("Hola", "soy", "Jorge")
    
    println(miArray5.joinToString()) //Hola, soy, Jorge
}