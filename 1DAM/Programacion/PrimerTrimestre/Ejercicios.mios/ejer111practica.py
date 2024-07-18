# Crear lista de 5 valores introducidos por el usuario
#Se borran los que sean mayores de 10 y se printea la nueva lista


lista=[]

for x in range(5):
    valor=int(input("Introduce un valor: "))
    lista.append(valor)

print("Lista original: ",lista)

posicion=0
lista2=[]
while posicion<len(lista):
    if lista[posicion]>=10:
        lista2.append(lista.pop(posicion))
    else:
        posicion=posicion+1

print("La lista sin los valores mayores o iguales a 10: ",lista)
print("Y la lista de elementos borrados es: ",lista2)

