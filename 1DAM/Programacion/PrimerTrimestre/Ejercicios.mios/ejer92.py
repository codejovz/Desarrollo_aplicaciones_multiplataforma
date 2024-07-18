lista=[]

for x in range(5):
    valor=int(input("Introduce un valor"))
    lista.append(valor)


for k in range(4):
    for x in range(4-k):
        if lista[x]<lista[x+1]:
            aux=lista[x]
            lista[x]=lista[x+1]
            lista[x+1]=aux



print("La lista ordenada de mayor a menor es: ")
print(lista)




for k in range(4):
    for x in range(4-k):
        if lista[x]>lista[x+1]:
            aux=lista[x+1]
            lista[x+1]=lista[x]
            lista[x]=aux



print("Y la lista ordenada de menor a mayor es:")
print(lista)
