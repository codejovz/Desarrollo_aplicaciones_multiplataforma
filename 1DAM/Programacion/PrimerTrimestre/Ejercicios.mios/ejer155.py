lista=[]

def meter_numeros():
    for x in range(5):
        num=int(input("Introduce un numero a la lista: "))
        lista.append(num)
    return lista

def imprimir(lista):
    print(lista)
    for elemento in lista:
        print(elemento)

def mayor_lista(lista):
    may=lista[0]
    for elemento in lista:
        if elemento>may:
            may=elemento
    print("El numero mayor es: ",may)

    
def sumar_lista(lista):
    suma=0
    for elemento in lista:
        suma=elemento+suma
    print("La suma de todos los elementos es: ",suma)
        

#PROGRAMA PRINCIPAL


lista=meter_numeros()
imprimir(lista)
mayor_lista(lista)
sumar_lista(lista)
