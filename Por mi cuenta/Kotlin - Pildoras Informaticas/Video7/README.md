[Video 7 de Pildoras Informaticas](https://youtu.be/mHaoKcvQZ5E?si=ci2Pv9ctrHXFvYts)

# Arrays

## Declaracion y tipos
Reserva varios espacios de memoria (como ficheros de oficina).
Sintaxis:

```Kotlin
val mesesDelAño:Array<String>= arrayOf("Enero", "Febrero", "Marzo");
val enterosInferencia=arrayOf(1, 4, 7, -1);
```
La primera posicion es el **0**.

```Kotlin
val mi_matriz=Array(5){0} //Inicializa las 5 posiciones a 0

mi_matriz[0] = 0 //se permite cambiar el val porque modificas el CONTENIDO
mi_matriz[1] = 1  // no dejaría poner 'mi_matriz(4){0} porque estariamos
mi_matriz[2] = 2  //cambiando la naturaleza del array
```
Abro [Kotlin Playground](https://play.kotlinlang.org/):

```Kotlin
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
```