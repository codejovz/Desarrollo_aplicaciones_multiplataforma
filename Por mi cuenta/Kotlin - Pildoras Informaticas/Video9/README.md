[Video 9 de Pildoras Informaticas](https://youtu.be/FBOOymivEcs?si=0GU7o0mddplMHuOf)

# Tipo ANY

Es la raíz de la jerarquía de clases en Kotlin (como 'Object' en Java).

 - Superclase UNIVERSAL solo con tipos **NO NULOS**.
 - La clase Any incluye tres métodos:
   - ```equals()```
   - ```hashcode()```
   - ```toString()```
 - No incluye los metodos ```clone()```, ```wait()```, ```notify()``` ni ```notifyAll()```.

 Para usar no nulos, hace falta ponerlo con genéricos. Se consigue escribiendo ```Any?```

 - Como es un lenguaje compilado, Any, al ser compilado, el compilador mapea todo y lo convierte al Object de Java.

 - Uso práctico: se declaran Any para almacenar variables que no sabemos que tipo van a contener.


```Kotlin
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


```