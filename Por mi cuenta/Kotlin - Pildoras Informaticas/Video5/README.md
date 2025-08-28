[Video 5 de Pildoras Informaticas](https://youtu.be/gzDvWYdJLLc?si=sDOCmiGsVB_F9PYK)


# Apuntes

## Tipos de datos
No existen los tipos primitivos: Son clases, por eso los tipos van con la primera letra en mayúscula.

- Int : numero entero 32 bits.
- Long: numero entero 64 bits.
- Short: numero entero 16 bits.
- Byte: numero entero 8 bits.
- Double: numero de punto flotante, 64 bits.
- Float: numero de punto flotante, 32 bits.

- Caracteres
- Booleano
- Cadenas: String
- Arrays
- Colecciones
- Nullables: se puede declarar cualquier tipo a nulo, añadiendole un '?'
- Any: super clase de tipos no nulos. Equivale al 'Object' de Java.
- Unit: Representa el tipo de retorno de una funcion que no devuelve nada util (como el void en Java).
- Nothing: Representa un valor que no regresa; util cuando se hacen operaciones que no se completan nunca.

Kotlin tiene **inferencia** de tipos, no hace falta que le pongas de que tipo es, kotlin infiere/deduce qué tipo es.

## Abrimos [Kotlin Playground](https://play.kotlinlang.org/)


```Kotlin
fun main() {  //main SOLO apps de consola, porque tendran otro punto de entrada (onCreate)
    
    println("Hola mundo, soy Jorge")  //Esta linea de codigo imprime el mensaje 'hola mundo'
    
    var edad:Int=10
    
    var nombre:String = "Jorge"
    
    println(nombre)
    println(edad)
}
```


