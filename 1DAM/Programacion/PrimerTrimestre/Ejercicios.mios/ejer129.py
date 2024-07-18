def multiplicar(lista,va):
    for x in range(len(lista)):
        multi=lista[x]*va
        print(multi)

lista=[3,7,8,10,2]
print("La lista completa es: ",lista)
print("Multiplicar cada elemento por 3: ")
multiplicar(lista,3)
