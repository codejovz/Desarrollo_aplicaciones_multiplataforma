#lista de 5 valores introducidos por el usuario
#se borran los que sean mayores de 10, guardandolo en una nueva lista
#Se printea la nueva lista, y la otra con los elementos borrados

lista=[]

for x in range(5):
    valor=int(input("Introduce un valor: "))
    lista.append(valor)

print("Lista original: ",lista)

posicion=0
lista2=[]
while posicion<len(lista):
    if lista[posicion]>=10:
        lista2.append(lista[posicion])
        del lista[posicion]
    else:
        posicion=posicion+1

print("La lista sin los valores mayores o iguales a 10: ",lista)
print("Y la lista de elementos borrados es: ",lista2)

