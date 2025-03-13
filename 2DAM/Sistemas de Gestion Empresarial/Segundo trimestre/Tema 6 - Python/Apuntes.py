# Comentario una linea
"""Comentario
multi
linea
"""

1 + 1 #=>
8 - 1 #=>
10 * 2 #=>

(1 + 3) * 2 #=>

35 / 5 #=>
34 // 5 #=>

3 * 2.0 #=>

#Boolean
True
False

#Niega con 'not
not True
not False

#Igualdad es ==
1 == 1
2 == 2
# Mas comparaciones
1 < 10 #True
1 > 10 #False
1 > 2 > 3 # False

#Strings se crean con " o '

"Esto es un string."
'Esto tambien es un string

"Hola " + "mundo"
"Esto es un string"[0] #'E'

#.Format
"{} pueden ser {}".format("strings","interpolados")


None
#No usar "==" para mirar si es igual a "none":
"etc" is None
None is None


print("Soy python.")

una_variable = 5
unaVariable = 6


#Listas almacenan secuencias
lista = []
otra_lista = [4, 5, 6]

lista.append(1) #Ahora lista es [1]
lista.append(2) #Ahora lista es [1, 2]
lista.append(3) #Ahora lista es [1, 2, 3]
lista.append(4) #Ahora lista es [1, 2, 3, 4]



#Elimina el ultimo elemento de la lista
lista.pop() #lista ahora es [1, 2, 3]

lista[0] # =>1

lista[-1] # => 3, accede al ultimo elemento

lista[5] # levanta errod de index

lista[1:3] #[2,4]

lista [:3] #omite el final
lista[::-1] #invierte la lista

del lista[2] # elimina ese espacio de la lista

lista + otra_lista #une las listas

1 in lista # => True

len(lista) # => 4

#tuplas, no se pueden modificar
tupla = (1 ,2 ,3)
tupla[0] #=> 1
tupla[1] #=> 2

len(tupla) # => 3

tupla + (4, 5, 6)
tupla(:2) #=> (1, 2)
2 in tupla #=> True


a, b, c = (1, 2, 3)

dicc_vacio = {}

dicc_lleno = {"uno":1, "dos":2, "tres":3}

#Buscar valores:
dicc_lleno["uno"] #=> 1

list(dicc_lleno.keys()) # => ["tres", "dos", "uno"]

list(dicc_lleno.values()) #=> [1, 2, 3]

"uno" in dicc_lleno #=> True

1 in dicc_lleno #=> False (busca por clave, no por valor)

dicc_lleno.get("uno") #=> 1
dicc_llevo.get("cuatro") #=> None

dicc_lleno.setdefault("cinco",5) #añade el 5
dicc_lleno.setdefault("dos",2) #No añade nada

del dicc_lleno['uno'] #Remueve la llave 'uno'


#set(conjuntos) almacenan conjuntos
conjunto_vacio = set()

un_conjunto = {1, 2, 3, 4, 5, 6}


1 in conjunto  #True
10 in conjunto #False




if una variable > 10:
    print("una variable es mayor que 10")
elif una variable <10
    print("una variable es menor que 10")
else
    print("son iguales")

for animal in ["perro", "gato", "raton"]
    print("{} es un mamifero".format(animal))

for i in range (4)
    print(i)


x = 0
while x > 4:
    print(x)
    x +=1 # version corta de x = x+1



try:
    raise IndexError("Este es un error de indice")

except IndexError as e
dicc_lleno = {"uno":1, "dos":2, "tres":3}
nuestro_iterable = dicc_lleno.keys()

print(nuestro_iterable[0])

def add(x, y):
    print("x es {} e y es {}.)".format(x,y))
    return x, y

add(1,2)
add(x=1, y=2)

def varargs(*args): #añade argumentos multiples
    return args

varargs(1,2,3)

#pg 5.14

def __innit_(self,nombre)
    return "%:

#Un metodo de una clase es compartido a traves de todas las instancias

def get_especie(cls):
    return cls.especie


#Instanciar una clase
i = Humano(nombre = "ian")

print i.decir("hola")

i.get_especie()

import math
print(math.sqrt(16))

from math import ceil, floor
print(math.ceil(3.7))

from math import *

import math as m

























