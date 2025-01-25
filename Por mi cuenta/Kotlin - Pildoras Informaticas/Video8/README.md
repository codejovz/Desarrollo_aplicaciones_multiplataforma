[Video 8 de Pildoras Informaticas](https://youtu.be/pB53kHLbSYY?si=QeYhNPw_l4cug2i-)

# Arrays II

En [Kotlin Playground](https://play.kotlinlang.org/) se puede añadir argumentos. Se pasan en ```Program arguments``` y luego se les llama como parámetros en el paréntesis.

```.map```: funcion que itera sobre los elementos.

```it``` es la convencion de 'iteración'. Yo lo entiendo mejor con 'x'

```toInt()``` convierte a enteros.

```toIntArray()``` convierte elementos iterados en un array de enteros.

```.sum()``` suma las iteraciones.

```size()``` da el tamaño del array.

Los argumentos que recibe kotlin, igual que en java, son obligatoriamente en **TEXTO**, no se le pueden pasar directamente ints.

```Kotlin
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
```