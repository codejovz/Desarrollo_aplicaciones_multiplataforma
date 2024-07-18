



def mayormenor(lista):
    may=lista[0]
    men=lista[0]
    for x in range(1,len(lista)):
        if lista[x]>may:
            may=lista[x]
        else:
            if lista[x]<men:
                men=lista[x]
    print("El numero mayor de la lista es: ",may)
    print("El numero menor de la lista es: ",men)


#BLOQUE PRINCIPAL

lista=[]
for x in range(5):
    valor=int(input("Introduce un valor a la lista: "))
    lista.append(valor)

print("La lista completa es: ",lista)
mayormenor(lista)
