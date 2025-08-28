def cargar():
    lista=[]
    for x in range(5):
        valor=int(input("Introduce un valor a la lista: "))
        lista.append(valor)
    return lista

def imprimir_mayor(lista):
    mayor=0
    for x in range(len(lista)):
        if lista[x]>lista[mayor]:
            mayor=x
    print("El mayor de la lista es: ",lista[mayor])

def imprimir_suma(lista):
    suma=0
    for x in range(len(lista)):
        suma=suma+lista[x]
    print("La suma es: ",suma)
        
