[Video 10 de Pildoras Informaticas](https://youtu.be/K1-KZEWu6RQ?si=c4HEnzF9JGlOtddV)


# Operadores

| Comparacion |                    | Logicos (booleanos)|                 |
| ----------- | ------------------ | ------------------ | --------------- |
| ````==````  | Igual a            | ```&&```           | Y logico.       |
| ```!=```    | Diferente a        | ```\|\|```         | O logico        |
| ````>````   | Mayor que          | ```!```            | Negacion logica |
| ```<```     | Menor que          |                    |                 |
| ````>=````  | Mayor o igual que  |                    |                 |
| ```<=```    | Menor o igual que  |                    |                 |
| ````===```` | Igual referencial  |                    |                 |


```===``` verifica si dos referencias apuntan al mismo objeto en memoria, no solo si tienen el mismo contenido / valor.


Aunque no salga en el video, abro [Kotlin Playground](https://play.kotlinlang.org/):

```Kotlin
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
```