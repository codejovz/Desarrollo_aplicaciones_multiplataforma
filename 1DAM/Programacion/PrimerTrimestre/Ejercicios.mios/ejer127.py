#Definir por asignacion una lista de enteros en el bloque principal
#Elaborar tres funciones: recibe lista y retorna la suma de valores
#Recibe lista y retorna el mayor valor.
#Recibe lista y retorna el menor valor.


def sumarizar(lista):
    suma=0
    for x in range(len(lista)):
        suma=suma+lista[x]
    return suma

def mayor(lista):
    may=lista[0]
    for x in range(1,len(lista)):
        if lista[x]>may:
            may=lista[x]
    return may

def menor(lista):
    men=lista[0]
    for x in range(1,len(lista)):
        if lista[x]<men:
            men=lista[x]
    return men


#BLOQUE PRINCIPAL DEL PROGRAMA

lista=[10,56,23,120,94]
print("La lista completa es: ",lista)
print("La suma de los valores es",sumarizar(lista))
print("El mayor valor de la lista es: ",mayor(lista))
print("El menor elemento de la lista es: ",menor(lista))

