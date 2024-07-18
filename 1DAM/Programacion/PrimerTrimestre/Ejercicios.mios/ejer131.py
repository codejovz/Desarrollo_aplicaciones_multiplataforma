#Confeccionar funcion que cargue por teclado lista de 5 enteros y la retorne
#Segunda funcion recibe lista y muestra los valores mayores a 10
#Desde el bloque principal se llama a las dos

def carga_lista():
    li=[]
    for x in range(5):
        valor=int(input("Introduce un valor a la lista: "))
        li.append(valor)
    return li

def imprimir_mayor10(li):
    print("Elementos de la lista mayores a 10:")
    for x in range(len(li)):
        if li[x]>10:
            print(li[x])

#BLOQUE PRINCIPAL DEL PROGRAMA
#Al bloque principal se le olvida la lista, la tienes que llamar aunque
#la haga la funcion
lista=carga_lista()
imprimir_mayor10(lista)
