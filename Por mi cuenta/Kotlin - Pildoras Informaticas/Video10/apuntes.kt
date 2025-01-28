fun main() {
    
    val nombre:String = "Jorge"
    
    val numero:Int = 20
    
    val verdadero:Boolean = true
    
    if(numero >= 18){
        println("$nombre es mayor de edad!")
    }
    
    if(nombre =="Jorge" && numero == 20){
        println("Se llama Jorge y el numero es 20")
    }
    
    if(numero <=21 && numero >=19){
        println("$numero esta entre el 19 y el 21")
    }
    
    if(numero>20 || verdadero){
        println("El numero es mayor a 20, o verdadero da true")
    }
    
}