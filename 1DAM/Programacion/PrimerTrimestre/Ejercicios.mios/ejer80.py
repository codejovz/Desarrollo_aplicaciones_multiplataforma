lista=[]

for x in range(5):
    valor=int(input("Introduce un valor a la lista"))
    lista.append(valor)

mayor=lista[0]
for x in range(1,5):
    if lista[x]>mayor:
        mayor=lista[x]

print("Lista completa")
print(lista)
print("Y el mayor valor de la lista es:" + str(mayor))
